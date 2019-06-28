package com.kttx.kt.phoenix.platform.service.course;

import com.kttx.kt.phoenix.platform.domain.dos.CourseBrowseDO;
import com.kttx.kt.phoenix.platform.domain.dos.CourseCollectDO;
import com.kttx.kt.phoenix.platform.mapper.course.CourseBrowseMapper;
import com.kttx.kt.phoenix.platform.mapper.course.CourseCollectMapper;
import com.kttx.kt.phoenix.platform.service.BaseService;
import com.kttx.kt.phoenix.platform.utils.enums.CourseBrowseStausEnum;
import com.kttx.kt.phoenix.platform.utils.enums.CourseCollectStatusEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

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
public class CourseBrowseServiceImpl extends BaseService {

    /**
     * 日志 <br>
     */
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Resource
    private CourseBrowseMapper courseBrowseMapper;

    /**
     * 根据courseId、userId、status查询是否报名
     * @param courseId
     * @param userId
     * @return
     */
    public Integer queryCourseBrowseByCourseIdAndUserId(String courseId, Long userId) {
        // 先用 courseId, userId, status 查询基础信息
        Map<String, Object> queryMap = new HashMap<>();
        queryMap.put("userId", userId);
        queryMap.put("courseId", courseId);
        queryMap.put("status", 1);
        // 查询数据
        return courseBrowseMapper.queryCourseBrowseByCourseIdAndUserId(queryMap);
    }

    /**
     * 收藏或者取消收藏课程
     * @param courseId
     * @param userId
     * @return
     */
    public Integer insertOrUpdateCollectCourse(String courseId, Long userId) {
        CourseBrowseDO courseBrowseDO = new CourseBrowseDO();
        courseBrowseDO.setCourseId(courseId);
        courseBrowseDO.setBasicCourseId(null);
        courseBrowseDO.setEnterpriseId(null);
        courseBrowseDO.setUserId(userId);
        courseBrowseDO.setStatus(CourseBrowseStausEnum.VALID.getValue());
        return courseBrowseMapper.insertOrUpdateCourseBrowse(courseBrowseDO);
    }




}
