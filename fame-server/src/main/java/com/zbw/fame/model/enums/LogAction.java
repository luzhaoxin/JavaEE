package com.zbw.fame.model.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum LogAction {
    SELECT("查询"),

    ADD("新增"),

    UPDATE("更新"),

    DELETE("删除"),

    SUCCESS("操作成功"),

    FAIL("操作失败"),
    ;

    private final String msg;
}
