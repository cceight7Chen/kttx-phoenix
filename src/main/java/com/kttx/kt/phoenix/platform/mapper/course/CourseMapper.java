package com.kttx.kt.phoenix.platform.mapper.course;

import com.kttx.kt.phoenix.platform.domain.dos.BannerDO;
import com.kttx.kt.phoenix.platform.domain.dos.CourseDO;
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
public interface CourseMapper {

    /**
     * 根据courseId查询basicId
     * @param courseId
     * @return
     */
    CourseDO queryCourseByCourseId(String courseId);




}
