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
 * @date 2019-06-26 15:17
 * 文件描述:
 *
 */
@Data
public class CourseStatisticInfoDTO extends BaseDTO {

    private static final long serialVersionUID = 3892134435413345687L;

    private Long id;

    private String gmtCreate;

    private String gmtModified;

    private String courseId;

    private String basicCourseId;

    private Integer viewNum;

    private Integer shareNum;

    private Integer signupNum;

    private Integer collectNum;

    private Integer commentNum;

    private Integer notesNum;

    private Integer interlocutionNum;

    private Integer treadNum;

    private Integer praiseNum;

    private Integer questionNum;

    private Integer judgeNum;

    private Double judgeAvarage;

    private Integer interactNum;

    private Integer finishedNum;

    private String extendInfo;

    private Integer status;


}
