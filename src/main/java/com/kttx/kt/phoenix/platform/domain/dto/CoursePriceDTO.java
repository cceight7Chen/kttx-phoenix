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
 * @date 2019-06-24 14:45
 * 文件描述:
 *
 */
@Data
public class CoursePriceDTO extends BaseDTO {

    private static final long serialVersionUID = 4231763983413345687L;

    private Long id;

    private String gmtCreate;

    private String gmtModified;

    private String courseId;

    private Long platformId;

    private Integer platformType;

    private Long referId;

    private Integer referType;

    private String distributePrice;

    private String originalPrice;

    private Integer status;


}
