package com.kttx.kt.phoenix.platform.service.course;

import com.kttx.kt.phoenix.platform.domain.dos.*;
import com.kttx.kt.phoenix.platform.domain.query.QueryCourseInfoDTO;
import com.kttx.kt.phoenix.platform.mapper.course.CourseMapper;
import com.kttx.kt.phoenix.platform.mapper.course.CoursePriceMapper;
import com.kttx.kt.phoenix.platform.mapper.course.CourseStatusMapper;
import com.kttx.kt.phoenix.platform.service.BaseService;
import org.apache.commons.collections.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

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
 * @date 2019-06-13 16:37
 * 文件描述:
 *
 */
@Service
public class CourseServiceImpl extends BaseService {

    /**
     * 日志 <br>
     */
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Resource
    private CourseMapper courseMapper;

    @Resource
    private CourseStatusMapper courseStatusMapper;

    @Resource
    private CoursePriceMapper coursePriceMapper;

    /**
     * 根据courseId、platformId、platformType
     * 查询课程状态信息
     * @param queryCourseInfoDTO
     * @return
     */
    public CourseStatusDO queryCourseStatusByCourseIdAndPlatform(QueryCourseInfoDTO queryCourseInfoDTO) {
        CourseStatusDO courseStatusDO = courseStatusMapper.queryCourseStatusByCourseIdAndPlatform(queryCourseInfoDTO);
        logger.info("queryCourseStatusByCourseIdAndPlatform is : " + courseStatusDO.toString());
        return courseStatusDO;
    }

    /**
     * 根据courseId/userId/enterpriseId
     * 查询课程信息
     * @param courseId
     * @return
     */
    public CourseDO queryCourseByCourseId(String courseId) {
        // 先用 courseId 查询基础信息
        CourseDO courseDO = courseMapper.queryCourseByCourseId(courseId);
        logger.info("queryCourseByCourseId is : " + courseDO.toString());
        return courseDO;
    }

    /**
     * 根据courseId、platformId、platformType、departmentId
     * 查询课程价格信息
     * @param queryCourseInfoDTO
     * @return price
     */
    public String queryCoursePriceByCourseIdAndPlatform(QueryCourseInfoDTO queryCourseInfoDTO, UserBasicDO userBasicDO) {
        List<CoursePriceDO> coursePriceDOList = coursePriceMapper.queryCoursePriceByCourseIdAndPlatform(queryCourseInfoDTO);
        logger.info("queryCoursePriceByCourseIdAndPlatform is : " + coursePriceDOList.toString());
        String price = "0";
        if (CollectionUtils.isNotEmpty(coursePriceDOList)) {
            // 先随便取一个值
            price = coursePriceDOList.get(0).getOriginalPrice();
            // 再判断是否需要重新取值
            if (Objects.isNull(userBasicDO) || Objects.isNull(userBasicDO.getDepartmentId())) {
                for (CoursePriceDO coursePriceDO : coursePriceDOList) {
                    if (coursePriceDO.getReferId().equals(userBasicDO.getDepartmentId())) {
                        price = coursePriceDO.getOriginalPrice();
                        break ;
                    }
                }
            }
        }
        return price;
    }


    /**
     * 测试redis
     * @param courseId
     * @return
     */
    public String getNameFromRedis(String courseId) throws Exception{
        String result = redisClient.get("testKeyWangjia");
        logger.error("getNameFromRedis result is {}", result);
        return result;
    }



}
