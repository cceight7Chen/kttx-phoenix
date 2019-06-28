package com.kttx.kt.phoenix.platform.domain.dto;

import com.kttx.kt.phoenix.platform.domain.BaseDTO;
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
 * @date 2019-06-26 09:30
 * 文件描述:
 *
 */
@Data
public class CourseSignupRuleDTO extends BaseDTO {

    private static final long serialVersionUID = 3892163983413345687L;

    private Long id;

    private String gmtCreate;

    private String gmtModified;

    private String courseId;

    private String sourceCourseId;

    private Integer name;

    private Integer mobile;

    private Integer mobileValidate;

    private Integer company;

    private Integer industry;

    private Integer position;

    private String extendInfo;

    private String remark;

    private Integer status;
    
}
