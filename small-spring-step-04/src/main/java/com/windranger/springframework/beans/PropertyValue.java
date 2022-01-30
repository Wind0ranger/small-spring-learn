package com.windranger.springframework.beans;

public class PropertyValue {
    /**
     * 属性名称
     */
    private String name;
    /**
     * 属性值
     */
    private Object object;

    public PropertyValue(String name, Object object) {
        this.name = name;
        this.object = object;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}
