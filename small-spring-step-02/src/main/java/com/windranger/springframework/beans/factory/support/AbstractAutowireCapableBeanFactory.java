package com.windranger.springframework.beans.factory.support;

import com.windranger.springframework.beans.factory.config.BeanDefinition;


/**
 * @author barry
 */
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory {

    @Override
    public Object createBean(String beanName, BeanDefinition beanDefinition) {
        Object bean = null;
        try {
            bean = beanDefinition.beanClass.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        addSingleton(beanName, bean);
        return bean;
    }
}
