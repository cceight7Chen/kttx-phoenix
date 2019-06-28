package com.kttx.kt.phoenix.platform.service.course;

import com.kttx.kt.phoenix.platform.domain.dos.*;
import com.kttx.kt.phoenix.platform.domain.dto.CourseSignupRuleDTO;
import com.kttx.kt.phoenix.platform.mapper.course.CourseSignupRuleMapper;
import com.kttx.kt.phoenix.platform.service.BaseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
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
public class CourseSignupRuleServiceImpl extends BaseService {

    /**
     * 日志 <br>
     */
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Resource
    private CourseSignupRuleMapper courseSignupRuleMapper;

    /**
     * 根据 courseId / sourceCourseId 查询课程报名需要的信息
     * 查询课程信息
     * @param courseId
     * @return
     */
    public CourseSignupRuleDTO queryCourseSignupRuleByCourseId(String courseId, String sourceCourseId) {
        // 先用 courseId 查询基础信息
        CourseSignupRuleDTO courseSignupRuleDTO = new CourseSignupRuleDTO();
        Map<String, Object> queryMap = new HashMap<>();
        queryMap.put("courseId", courseId);
        queryMap.put("sourceCourseId", sourceCourseId);
        CourseSignupRuleDO courseSignupRuleDO = courseSignupRuleMapper.queryCourseSignupRuleByCourseId(queryMap);
        logger.info("queryCourseSignupRuleByCourseId is : " + courseSignupRuleDO.toString());
        BeanUtils.copyProperties(courseSignupRuleDO, courseSignupRuleDTO);
        return courseSignupRuleDTO;
    }




}
