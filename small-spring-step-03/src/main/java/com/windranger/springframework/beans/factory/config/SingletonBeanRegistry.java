package com.windranger.springframework.beans.factory.config;

public interface SingletonBeanRegistry {
    /**
     * 获取 单例对象
     */
    Object getSingleton(String beanName);
}
