package com.kttx.kt.phoenix.platform.controller.course;

import com.kttx.kt.phoenix.platform.common.base.ResponseVO;
import com.kttx.kt.phoenix.platform.controller.BaseController;
import com.kttx.kt.phoenix.platform.domain.dos.CourseDO;
import com.kttx.kt.phoenix.platform.domain.dos.CourseStatusDO;
import com.kttx.kt.phoenix.platform.domain.dos.UserBasicDO;
import com.kttx.kt.phoenix.platform.domain.dto.CourseDTO;
import com.kttx.kt.phoenix.platform.domain.dto.CourseSignupInfoDTO;
import com.kttx.kt.phoenix.platform.domain.dto.CourseSignupRuleDTO;
import com.kttx.kt.phoenix.platform.domain.dto.CourseStatusDTO;
import com.kttx.kt.phoenix.platform.domain.query.QueryCourseInfoDTO;
import com.kttx.kt.phoenix.platform.service.course.*;
import com.kttx.kt.phoenix.platform.utils.constants.KtErrorEnum;
import com.kttx.kt.phoenix.platform.utils.enums.CourseStatusEnum;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Objects;

/***
 *
 *          ┌─┐       ┌─┐
 *       ┌──┘ ┴───────┘ ┴──┐
 *       │                 │
 *       │       ───       │
 *       │  ─┬┘       └┬─  │
 *       │                 │
 *       │       ─┴─       │
 *       │                 │
 *       └───┐         ┌───┘
 *           │         │
 *           │         │
 *           │         │
 *           │         └──────────────┐
 *           │                        │
 *           │                        ├─┐
 *           │                        ┌─┘    
 *           │                        │
 *           └─┐  ┐  ┌───────┬──┐  ┌──┘         
 *             │ ─┤ ─┤       │ ─┤ ─┤         
 *             └──┴──┘       └──┴──┘ 
 *               神兽保佑  代码无BUG!
 *
 *
 * @author : wangjia
 * @date 2019-06-18 16:47
 * 文件描述:
 *
 */
@RestController
public class CourseController extends BaseController {

    /**
     * 日志
     */
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Resource
    private CourseServiceImpl courseService;

    @Resource
    private CourseSignupRuleServiceImpl courseSignupRuleService;

    @Resource
    private CourseSignupInfoServiceImpl courseSignupInfoService;

    @Resource
    private CourseCollectServiceImpl courseCollectService;

    @Resource
    private CourseBrowseServiceImpl courseBrowseService;

    @PostMapping("KTP2001001")
    public ResponseVO queryCourseInfo(@RequestBody QueryCourseInfoDTO queryCourseInfoDTO) {

        logger.error("KTP2001001-queryCourseInfo begin ...");
        ResponseVO responseVO = new ResponseVO();
        CourseDTO courseDTO = new CourseDTO();

        // 课程id为空直接返回错误
        if (StringUtils.isBlank(queryCourseInfoDTO.getCourseId())) {
            logger.error(KtErrorEnum.K_200001.getErrorDesc());
            return responseVO.build(new Exception(KtErrorEnum.K_200001.getErrorDesc()));
        }

        // 获取用户基础信息
        UserBasicDO userBasicDO = getUserBasicInfo(queryCourseInfoDTO);

        // 查询课程状态
        CourseStatusDTO courseStatusDTO = new CourseStatusDTO();
        CourseStatusDO courseStatusDO = courseService.queryCourseStatusByCourseIdAndPlatform(queryCourseInfoDTO);
        // 判断课程状态是否被删除
        if (Objects.nonNull(courseStatusDO) && courseStatusDO.getStatus().equals(CourseStatusEnum.COURSE_DELETE.getValue())) {
            logger.error(KtErrorEnum.K_200002.getErrorDesc());
            return responseVO.build(new Exception(KtErrorEnum.K_200002.getErrorDesc()));
        }

        // TODO 查询本人是否可以看到该课程


        // 查询课程详情
        CourseDO courseDO = courseService.queryCourseByCourseId(queryCourseInfoDTO.getCourseId());
        BeanUtils.copyProperties(courseDO, courseDTO);

        // 查询课程价格
        String price = courseService.queryCoursePriceByCourseIdAndPlatform(queryCourseInfoDTO, userBasicDO);
        courseDTO.setPrice(price);

        // 查询签到需求信息
        CourseSignupRuleDTO courseSignupRuleDTO = courseSignupRuleService.queryCourseSignupRuleByCourseId(courseDO.getId(), courseDO.getSourceCourseId());
        courseDTO.setCourseSignupRuleDTO(courseSignupRuleDTO);

        // TODO 查询相似课程列表

        // TODO 查询该讲师的其他课程



        // TODO 查询浏览统计,需要在原来的基础上线+1

        // TODO 查询累计统计人数

        // TODO


        // 查询报名的人数和人员信息 TODO 这里查询的是本机构的，不是courseId下面的，是否需要确认
        List<CourseSignupInfoDTO> courseSignupInfoDTOList = courseSignupInfoService.queryCourseSignupInfoByCourseId(courseDO.getId(), courseDO.getSourceCourseId());
        courseDTO.setCourseSignupInfoDTOList(courseSignupInfoDTOList);
        if(CollectionUtils.isNotEmpty(courseSignupInfoDTOList)) {
            courseDTO.setSignupNum(courseSignupInfoDTOList.size());
        }

        // TODO 查询统计信息，包括：浏览人数、收藏人数、报名人数（但是这里报名人数是basicCourseId下面的，这里是否要调整）


        // 如果学生登录，查看是否报名、关注、我的浏览
        if (Objects.nonNull(userBasicDO)) {
            // 查看学生是否报名
            Integer signupCount = courseSignupInfoService.queryCourseSignupInfoByCourseIdAndUserId(courseDO.getId(), userBasicDO.getUserId());
            courseDTO.setSignupState(signupCount > 0);

            // 查看学生是否收藏
            Integer collectCount = courseCollectService.queryCourseCollectByCourseIdAndUserId(courseDO.getId(), userBasicDO.getUserId());
            courseDTO.setCollectState(collectCount > 0);

            // 添加到我的浏览里(成功或者失败，都不要影响主流程)
            courseBrowseService.insertOrUpdateCollectCourse(courseDO.getId(), userBasicDO.getUserId());
        }

        // TODO 获取打赏人数

        // TODO 获取评价列表和评分

        // TODO 课程问答

        // TODO 课程相关问卷

        // TODO 课程相关测验

        // TODO 课程相关测评

        // TODO 课程相关作业

        // TODO 课程附件

        // TODO 其他问题






        responseVO.setData(courseDTO);
        return responseVO;
    }


}
