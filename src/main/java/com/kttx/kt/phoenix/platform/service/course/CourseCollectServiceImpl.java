package com.kttx.kt.phoenix.platform.service.course;

import com.kttx.kt.phoenix.platform.domain.dos.CourseCollectDO;
import com.kttx.kt.phoenix.platform.domain.dto.CourseSignupInfoDTO;
import com.kttx.kt.phoenix.platform.mapper.course.CourseCollectMapper;
import com.kttx.kt.phoenix.platform.mapper.course.CourseSignupInfoMapper;
import com.kttx.kt.phoenix.platform.service.BaseService;
import com.kttx.kt.phoenix.platform.utils.enums.CourseCollectStatusEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
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
public class CourseCollectServiceImpl extends BaseService {

    /**
     * 日志 <br>
     */
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Resource
    private CourseCollectMapper courseCollectMapper;

    /**
     * 根据courseId、userId、status查询是否报名
     * @param courseId
     * @param userId
     * @return
     */
    public Integer queryCourseCollectByCourseIdAndUserId(String courseId, Long userId) {
        // 先用 courseId 查询基础信息
        Map<String, Object> queryMap = new HashMap<>();
        queryMap.put("courseId", courseId);
        queryMap.put("userId", userId);
        queryMap.put("status", 1);
        // 查询数据
        return courseCollectMapper.queryCourseCollectByCourseIdAndUserId(queryMap);
    }

    /**
     * 收藏或者取消收藏课程
     * @param courseId
     * @param userId
     * @return
     */
    public Integer insertOrUpdateCollectCourse(String courseId, Long userId) {
        CourseCollectDO courseCollectDO = new CourseCollectDO();
        courseCollectDO.setCourseId(courseId);
        courseCollectDO.setBasicCourseId(null);
        courseCollectDO.setEnterpriseId(null);
        courseCollectDO.setUserId(userId);
        courseCollectDO.setStatus(CourseCollectStatusEnum.OK_COLLECT.getValue());
        return courseCollectMapper.insertOrUpdateCollectCourse(courseCollectDO);
    }




}
