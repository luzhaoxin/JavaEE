package com.zbw.fame.exception;

import lombok.Getter;

@Getter
public class NotFoundException extends TipException {
    /**
     * 资源找不到的class类
     */
    private Class<?> clz;

    public NotFoundException() {
    }

    public NotFoundException(Class<?> clz) {
        this.clz = clz;
    }
}
