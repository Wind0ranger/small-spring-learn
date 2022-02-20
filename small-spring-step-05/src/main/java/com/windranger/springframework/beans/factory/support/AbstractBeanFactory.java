package com.windranger.springframework.beans.factory.support;

import com.windranger.springframework.beans.BeansException;
import com.windranger.springframework.beans.factory.BeanFactory;
import com.windranger.springframework.beans.factory.config.BeanDefinition;

public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {
    @Override
    public Object getBean(String name) throws BeansException {
        return doGetBean(name, null);
    }

    @Override
    public Object getBean(String name, Object... args) throws BeansException {
        return doGetBean(name, args);
    }

    @Override
    public <T> T getBean(String name, Class<T> requiredType) throws BeansException {
        return (T) getBean(name);
    }

    private Object doGetBean(String name, Object[] args) {
        Object bean = getSingleton(name);
        if (bean != null) {
            return bean;
        }
        BeanDefinition beanDefinition = getBeanDefinition(name);
        bean = createBean(name, beanDefinition, args);
        return bean;
    }

    /**
     * 获取bean对象
     *
     * @param beanName
     * @return
     */
    protected abstract BeanDefinition getBeanDefinition(String beanName);

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition, Object[] args);
}
