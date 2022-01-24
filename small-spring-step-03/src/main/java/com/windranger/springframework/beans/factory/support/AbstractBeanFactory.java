package com.windranger.springframework.beans.factory.support;

import com.windranger.springframework.beans.factory.BeanFactory;
import com.windranger.springframework.beans.factory.config.BeanDefinition;

import java.util.Objects;

public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {

    @Override
    public Object getBean(String beanName) {
        return doGetBean(beanName, null);
    }

    @Override
    public Object getBean(String beanName, Object... args) {
        return getBean(beanName, args);
    }

    protected <T> T doGetBean(final String beanName, final Object[] args) {
        Object bean = getSingleton(beanName);
        if (bean != null) {
            return (T) bean;
        }
        BeanDefinition beanDefinition = getBeanDefinition(beanName);
        return (T) createBean(beanName, beanDefinition, args);
    }

    public abstract BeanDefinition getBeanDefinition(String beanName);

    public abstract Object createBean(String beanName, BeanDefinition beanDefinition, Object[] args);
}
