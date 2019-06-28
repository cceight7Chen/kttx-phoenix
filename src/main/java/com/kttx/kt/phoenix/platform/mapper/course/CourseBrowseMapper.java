package com.kttx.kt.phoenix.platform.mapper.course;

import com.kttx.kt.phoenix.platform.domain.dos.CourseBrowseDO;
import com.kttx.kt.phoenix.platform.domain.dos.CourseCollectDO;
import com.kttx.kt.phoenix.platform.domain.dto.CourseBrowseDTO;
import org.apache.ibatis.annotations.Mapper;

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
public interface CourseBrowseMapper {

    /**
     * 根据courseId、userId 查询用户报名信息
     * @param queryMap
     * @return
     */
    Integer queryCourseBrowseByCourseIdAndUserId(Map<String, Object> queryMap);


    Integer insertOrUpdateCourseBrowse(CourseBrowseDO courseBrowseDO);


}
