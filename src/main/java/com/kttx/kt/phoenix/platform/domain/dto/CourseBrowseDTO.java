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
public class CourseBrowseDTO extends BaseDTO {

    private static final long serialVersionUID = 3878236435498205687L;

    private Long id;

    private String gmtCreate;

    private String gmtModified;

    private String courseId;

    private String basicCourseId;

    private Long userId;

    private Long enterpriseId;

    private Integer status;


}
