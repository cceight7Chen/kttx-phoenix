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
public enum CourseSignupInfoStatusEnum {


    /**
     * 1：生效/正常
     */
    VALID(1, "生效"),

    /**
     * 2：被拒绝
     */
    REFUSE(2, "生效"),

    /**
     * 3：取消
     */
    CANCEL(3, "生效"),

    /**
     * 4：未支付
     */
    NO_PAY(4, "生效"),
    ;

    private Integer value;

    private String name;

    public Integer getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    CourseSignupInfoStatusEnum(Integer value, String name) {
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
        for (CourseSignupInfoStatusEnum courseSignupInfoStatusEnum : CourseSignupInfoStatusEnum.values()) {
            if (courseSignupInfoStatusEnum.getValue().equals(value)) {
                return courseSignupInfoStatusEnum.getName();
            }
        }
        return "";
    }
}
