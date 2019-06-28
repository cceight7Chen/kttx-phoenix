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
 * @date 2019-06-18 17:34
 * 文件描述:
 *
 */
@Data
public class CourseStatusDTO extends BaseDTO {

    private static final long serialVersionUID = 4231122123413345687L;

    private String id;

    private String gmtCreate;

    private String gmtModified;

    private Long creatorId;

    private String creator;

    private Long modifierId;

    private String modifier;

    private String courseId;

    private Integer courseState;

    private Integer recommendState;

    private Long verifyUserId;

    private String verifyUser;

    private String verifyReason;

    private String verifyTime;

    private Long platformId;

    private Integer platformType;

    private String SharePrice;

    private String ShareType;

    private String ShareState;

    private Integer status;

}
