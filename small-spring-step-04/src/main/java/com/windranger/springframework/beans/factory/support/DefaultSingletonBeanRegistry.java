package com.windranger.springframework.beans.factory.support;

import com.windranger.springframework.beans.factory.config.SingletonBeanRegistry;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {

    private Map<String, Object> beanMap = new ConcurrentHashMap<>();

    @Override
    public Object getSingleton(String beanName) {
        return beanMap.get(beanName);
    }

    protected void addSingleton(String beanName, Object object) {
        beanMap.put(beanName, object);
    }
}
