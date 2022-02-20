package com.windranger.springframework.beans.factory.support;

import com.windranger.springframework.beans.factory.config.SingletonBeanRegistry;

import java.util.HashMap;
import java.util.Map;

/**
 * @author barry
 */
public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {

    private Map<String, Object> singleObjects = new HashMap<>();

    @Override
    public Object getSingleton(String beanName) {
        return singleObjects.get(beanName);
    }

    protected void addSingleton(String beanName, Object bean) {
        singleObjects.put(beanName, bean);
    }
}
