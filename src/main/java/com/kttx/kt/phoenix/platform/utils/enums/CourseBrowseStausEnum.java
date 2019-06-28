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
public enum CourseBrowseStausEnum {


    /**
     * -1: 删除
     */
    INVALID(-1, "删除"),

    /**
     * 1: 生效
     */
    VALID(1, "生效"),
    ;

    private Integer value;

    private String name;

    public Integer getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    CourseBrowseStausEnum(Integer value, String name) {
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
        for (CourseBrowseStausEnum courseBrowseStausEnum : CourseBrowseStausEnum.values()) {
            if (courseBrowseStausEnum.getValue().equals(value)) {
                return courseBrowseStausEnum.getName();
            }
        }
        return "";
    }
}
