package com.kttx.kt.phoenix.platform.service.course;

import com.kttx.kt.phoenix.platform.domain.dos.CourseSignupInfoDO;
import com.kttx.kt.phoenix.platform.domain.dos.CourseSignupRuleDO;
import com.kttx.kt.phoenix.platform.domain.dto.CourseSignupInfoDTO;
import com.kttx.kt.phoenix.platform.domain.dto.CourseSignupRuleDTO;
import com.kttx.kt.phoenix.platform.mapper.course.CourseSignupInfoMapper;
import com.kttx.kt.phoenix.platform.mapper.course.CourseSignupRuleMapper;
import com.kttx.kt.phoenix.platform.service.BaseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
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
public class CourseSignupInfoServiceImpl extends BaseService {

    /**
     * 日志 <br>
     */
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Resource
    private CourseSignupInfoMapper courseSignupInfoMapper;

    /**
     * 根据 courseId / sourceCourseId 查询课程报名需要的信息
     * 查询课程信息
     * @param courseId
     * @return
     */
    public List<CourseSignupInfoDTO> queryCourseSignupInfoByCourseId(String courseId, String basicCourseId) {
        // 先用 courseId 查询基础信息
        Map<String, Object> queryMap = new HashMap<>();
        queryMap.put("courseId", courseId);
        queryMap.put("basicCourseId", basicCourseId);
        // 查询数据
        return courseSignupInfoMapper.queryCourseSignupInfoByCourseId(queryMap);

    }

    /**
     * 根据courseId、userId、status查询是否报名
     * @param courseId
     * @param userId
     * @return
     */
    public Integer queryCourseSignupInfoByCourseIdAndUserId(String courseId, Long userId) {
        // 先用 courseId 查询基础信息
        Map<String, Object> queryMap = new HashMap<>();
        queryMap.put("courseId", courseId);
        queryMap.put("userId", userId);
        queryMap.put("status", 1);
        // 查询数据
        return courseSignupInfoMapper.queryCourseSignupInfoByCourseIdAndUserId(queryMap);
    }




}
