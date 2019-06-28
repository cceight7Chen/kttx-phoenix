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
 * @date 2019-06-06 16:36
 * 文件描述:
 *
 */
@Data
public class BannerDO {

    /**
     * id
     */
    private Long id;

    /**
     * id
     */
    private String gmtCreate;

    /**
     * id
     */
    private String gmtModified;

    /**
     * id
     */
    private Long creatorId;

    /**
     * creator
     */
    private String creator;

    /**
     * id
     */
    private Long modifierId;

    /**
     * id
     */
    private String modifier;

    /**
     * 机构Id
     */
    private Long enterpriseId;

    /**
     * 图片类型
     */
    private Integer type;

    /**
     * 图片序号
     */
    private Integer position;

    /**
     * 图片路径
     */
    private String imgUrl;

    /**
     * 广告链接等
     */
    private String imgLink;

    /**
     * 扩展字段，存放json格式数据
     */
    private String extendInfo;

    /**
     * 状态，com.kttx.kt.phoenix.platform.utils.enums.BannerStatusEnum
     */
    private Integer status;




}
