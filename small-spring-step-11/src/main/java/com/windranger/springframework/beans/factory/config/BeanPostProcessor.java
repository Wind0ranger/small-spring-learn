package com.windranger.springframework.beans.factory.config;

import com.windranger.springframework.beans.BeansException;

/**
 * 用于修改新实例化 Bean 对象的扩展点
 */
public interface BeanPostProcessor {

    /**
     * 在 Bean 对象执行初始化方法之前，执行此方法
     */
    Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException;

    /**
     * 在 Bean 对象执行初始化方法之后，执行此方法
     */
    Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException;

}
