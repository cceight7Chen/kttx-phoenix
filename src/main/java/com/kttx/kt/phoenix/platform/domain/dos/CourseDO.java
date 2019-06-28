package com.kttx.kt.phoenix.platform.domain.dos;

import lombok.Data;


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
 * @date 2019-06-18 17:34
 * 文件描述:
 *
 */
@Data
public class CourseDO {

    private String id;

    private String gmtCreate;

    private String gmtModified;

    private Long creatorId;

    private String creator;

    private Long modifierId;

    private String modifier;

    private String courseName;

    private Integer type;

    private String basicCourseId;

    private String sourceCourseId;

    private Long objectId;

    private Integer objectType;

    private String startTime;

    private String endTime;

    private String coursePicUrl;

    private Integer upperLimit;

    private String courseHour;

    private Double courseScore;

    private String qrcodeUrl;

    private String courseContent;

    private String industry;

    private Integer positionLevel;

    private String courseLabel;

    private Long lecturerId;

    private String scoreCondition;

    private String courseCity;

    private Integer courseInternalState;

    private Integer courseDistributionState;

    private String attachmentInfo;

    private Integer visibleState;

    private Integer status;


}
