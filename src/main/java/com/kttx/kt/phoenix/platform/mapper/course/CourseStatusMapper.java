package com.kttx.kt.phoenix.platform.mapper.course;

import com.kttx.kt.phoenix.platform.domain.dos.CourseDO;
import com.kttx.kt.phoenix.platform.domain.dos.CourseStatusDO;
import com.kttx.kt.phoenix.platform.domain.query.QueryCourseInfoDTO;
import org.apache.ibatis.annotations.Mapper;

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
public interface CourseStatusMapper {

    /**
     * 根据courseId、platformId、platformType查询课程状态信息
     * @param queryCourseInfoDTO
     * @return
     */
    CourseStatusDO queryCourseStatusByCourseIdAndPlatform(QueryCourseInfoDTO queryCourseInfoDTO);




}
