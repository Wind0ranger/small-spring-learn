package com.windranger.springframework.beans.factory.support;

import com.windranger.springframework.beans.factory.config.BeanDefinition;


public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory {

    @Override
    public Object createBean(String beanName, BeanDefinition beanDefinition) {
        Class beanClass = beanDefinition.beanClass;
        Object bean = null;
        try {
            bean = beanClass.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        addSingleton(beanName, bean);
        return bean;
    }
}
