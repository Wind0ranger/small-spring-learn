package com.windranger.springframework.beans.factory.config;

public interface SingletonBeanRegistry {
    /**
     * 获取单例对象
     */
    public Object getSingleton(String beanName);
}
