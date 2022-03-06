package com.windranger.springframework.beans.factory.config;

import com.windranger.springframework.beans.BeansException;
import com.windranger.springframework.beans.factory.BeanFactory;

public interface AutowireCapableBeanFactory extends BeanFactory {

    /**
     * 执行 BeanPostProcessors 接口实现类的 postProcessBeforeInitialization 方法
     */
    Object applyBeanPostProcessorsBeforeInitialization(Object existingBean, String beanName) throws BeansException;

    /**
     * 执行 BeanPostProcessors 接口实现类的 postProcessorsAfterInitialization 方法
     */
    Object applyBeanPostProcessorsAfterInitialization(Object existingBean, String beanName) throws BeansException;

}
