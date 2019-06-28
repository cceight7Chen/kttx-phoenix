package com.kttx.kt.phoenix.platform.mapper.course;

import com.kttx.kt.phoenix.platform.domain.dos.CourseSignupInfoDO;
import com.kttx.kt.phoenix.platform.domain.dos.CourseSignupRuleDO;
import com.kttx.kt.phoenix.platform.domain.dto.CourseSignupInfoDTO;
import org.apache.ibatis.annotations.Mapper;

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
 * @date 2019-05-30 17:36
 * 文件描述:
 *
 */
@Mapper
public interface CourseSignupInfoMapper {

    /**
     * 根据courseId查询该课程报名需要什么信息
     * @param queryMap
     * @return
     */
    List<CourseSignupInfoDTO> queryCourseSignupInfoByCourseId(Map<String, Object> queryMap);

    /**
     * 根据courseId、userId 查询用户报名信息
     * @param queryMap
     * @return
     */
    Integer queryCourseSignupInfoByCourseIdAndUserId(Map<String, Object> queryMap);



}
