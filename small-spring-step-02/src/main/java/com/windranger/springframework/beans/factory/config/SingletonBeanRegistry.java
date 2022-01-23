package com.windranger.springframework.beans.factory.config;

public interface SingletonBeanRegistry {
    /**
     * 获取单例对象
     *
     * @param beanName bean名称
     * @return bean对象
     */
    Object getSingleton(String beanName);
}
