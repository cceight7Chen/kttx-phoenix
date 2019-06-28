package com.kttx.kt.phoenix.platform.controller.ztools;

import com.kttx.kt.phoenix.platform.domain.dto.data.CourseDataDTO;
import com.kttx.kt.phoenix.platform.service.course.CourseServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * @date 2019-06-13 10:08
 * 文件描述: 这个方法是用来刷数据用的方法，如果有其他功能，自行建立新的controller
 *
 */
@RestController
public class CourseDataController {

    /**
     * 日志
     */
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Resource
    private CourseServiceImpl courseService;


    // 处理 kttx_course_statistic_info 表数据
    @PostMapping("KTP200101")
    public void dealCourseStatisticInfo(@RequestBody CourseDataDTO courseDataDTO) {

        logger.error("dealCourseStatisticInfo begin ...");
        logger.error("courseDataDTO is : " + courseDataDTO);

        List<String> idList = new ArrayList<>(Arrays.asList(courseDataDTO.getIds().split(",")));

        for (String courseId : idList) {
            // 获取basicCourseId
            // String basicCourseId = courseService.getCourseBasicId(courseId);

        }

        logger.error("idList is : " + idList);




    }




}
