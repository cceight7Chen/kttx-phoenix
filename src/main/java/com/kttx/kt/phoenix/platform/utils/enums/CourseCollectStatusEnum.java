package com.kttx.kt.phoenix.platform.utils.enums;

import java.util.Objects;

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
 * @date 2019-06-24 13:51
 * 文件描述:
 *
 */
public enum CourseCollectStatusEnum {


    /**
     * -1：取消收藏
     */
    CANCEL_COLLECT(-1, "取消收藏"),

    /**
     * 1：收藏
     */
    OK_COLLECT(1, "收藏"),
    ;

    private Integer value;

    private String name;

    public Integer getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    CourseCollectStatusEnum(Integer value, String name) {
        this.value = value;
        this.name = name;
    }

    /**
     * 通过名字获取Name
     * @param value
     * @return
     */
    public static String getNameByValue(Integer value) {
        if(Objects.isNull(value)){
            return "";
        }
        for (CourseCollectStatusEnum courseCollectStatusEnum : CourseCollectStatusEnum.values()) {
            if (courseCollectStatusEnum.getValue().equals(value)) {
                return courseCollectStatusEnum.getName();
            }
        }
        return "";
    }
}
