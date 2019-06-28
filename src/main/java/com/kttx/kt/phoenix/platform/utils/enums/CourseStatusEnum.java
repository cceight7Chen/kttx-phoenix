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
public enum CourseStatusEnum {


    /**
     * 1：审核不通过
     */
    COURSE_FAIL(1, "审核不通过"),

    /**
     * 2：成功
     */
    COURSE_SUCCESS(2, "成功"),

    /**
     * 3：删除/屏蔽
     */
    COURSE_DELETE(3, "删除/屏蔽"),

    /**
     * 4：待审核
     */
    COURSE_INIT(4, "待审核"),
    ;

    private Integer value;

    private String name;

    public Integer getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    CourseStatusEnum(Integer value, String name) {
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
        for (CourseStatusEnum courseStatusEnum : CourseStatusEnum.values()) {
            if (courseStatusEnum.getValue().equals(value)) {
                return courseStatusEnum.getName();
            }
        }
        return "";
    }
}
