package com.windranger.springframework.beans.factory.support;

import com.windranger.springframework.beans.factory.BeanFactory;
import com.windranger.springframework.beans.factory.config.BeanDefinition;

public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {

    @Override
    public Object getBean(String beanName) {
        return doGetBean(beanName, null);
    }

    @Override
    public Object getBean(String beanName, Object... args) {
        return doGetBean(beanName, args);
    }

    public <T> T doGetBean(String beanName, Object[] args) {
        Object bean = getSingleton(beanName);
        if (bean != null) {
            return (T) bean;
        }
        BeanDefinition beanDefinition = getBeanDefinition(beanName);
        return (T) createBean(beanName, beanDefinition, args);
    }

    /**
     * 获取beanDefinition对象
     */
    public abstract BeanDefinition getBeanDefinition(String beanName);

    /**
     * 创建bean对象
     */
    public abstract Object createBean(String beanName, BeanDefinition beanDefinition, Object[] args);

}
