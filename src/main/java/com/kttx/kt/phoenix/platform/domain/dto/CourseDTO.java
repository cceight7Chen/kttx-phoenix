package com.kttx.kt.phoenix.platform.domain.dto;

import com.kttx.kt.phoenix.platform.domain.BaseDTO;
import lombok.Data;

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
 * @date 2019-06-18 17:34
 * 文件描述:
 *
 */
@Data
public class CourseDTO extends BaseDTO {

    private static final long serialVersionUID = 4230932123413254187L;

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

    private Integer status;

    /******************************************************************/

    private String originalPrice;

    /**
     * 报名人数
     */
    private Integer signupNum;

    /**
     * 浏览人数
     */
    private Integer viewNum;

    /**
     * 收藏人数
     */
    private Integer collectNum;

    /**
     * 是否报名
     */
    private Boolean signupState;

    /**
     * 是否收藏/关注
     */
    private Boolean collectState;

    /**
     * 价格
     */
    private String price;

    /**
     * 签到需要信息
     */
    private CourseSignupRuleDTO courseSignupRuleDTO;

    /**
     * 报名人员
     */
    private List<CourseSignupInfoDTO> courseSignupInfoDTOList;





}
