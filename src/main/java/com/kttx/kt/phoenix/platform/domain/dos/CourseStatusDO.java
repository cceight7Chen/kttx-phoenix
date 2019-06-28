package com.kttx.kt.phoenix.platform.domain.dos;

import lombok.Data;

import java.math.BigDecimal;


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
public class CourseStatusDO {

    private String id;

    private String gmtCreate;

    private String gmtModified;

    private String courseId;

    private Integer status;

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


}
