package com.windranger.springframework.beans;

public class PropertyValue {

    /**
     * 属性名
     */
    private String name;
    /**
     * 值
     */
    private Object value;

    public PropertyValue(String name, Object value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Object getValue() {
        return value;
    }
}
