package com.windranger.springframework.beans.factory.config;

public interface SingletonBeanRegistry {
    /**
     * 获取单例bean
     */
    Object getSingleton(String beanName);
}
