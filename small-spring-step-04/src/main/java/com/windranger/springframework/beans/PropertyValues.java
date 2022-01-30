package com.windranger.springframework.beans;

import java.util.ArrayList;
import java.util.List;

public class PropertyValues {

    private List<PropertyValue> propertyValueList = new ArrayList<>();

    /**
     * 添加属性
     */
    public void addPropertyValue(PropertyValue propertyValue) {
        propertyValueList.add(propertyValue);
    }

    /**
     * 获取 属性
     */
    public List<PropertyValue> getPropertyValues() {
        return propertyValueList;
    }
}
