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
 * @date 2019-06-04 17:30
 * 文件描述:
 *
 */
public enum ShowStatusEnum {

    /**
     * 0：不显示
     */
    NO_SHOW(0, "不显示"),

    /**
     * 1：正常显示
     */
    SHOW(1, "显示")
    ;

    private Integer value;

    private String name;

    public Integer getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    ShowStatusEnum(Integer value, String name) {
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
        for (ShowStatusEnum showStatusEnum : ShowStatusEnum.values()) {
            if (showStatusEnum.getValue().equals(value)) {
                return showStatusEnum.getName();
            }
        }
        return "";
    }


}
