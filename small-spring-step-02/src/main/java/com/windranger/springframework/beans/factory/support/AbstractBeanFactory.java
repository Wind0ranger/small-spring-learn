package com.windranger.springframework.beans.factory.support;

import com.windranger.springframework.beans.factory.BeanFactory;
import com.windranger.springframework.beans.factory.config.BeanDefinition;

import java.util.Objects;

public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {

    @Override
    public Object getBean(String beanName) {
        Object singleton = getSingleton(beanName);
        if (!Objects.isNull(singleton)) {
            return singleton;
        }
        BeanDefinition beanDefinition = getBeanDefinition(beanName);
        if (Objects.isNull(beanDefinition)) {
            return null;
        }
        return createBean(beanName, beanDefinition);
    }

    /**
     * 获取 beanDefinition
     *
     * @return
     */
    public abstract BeanDefinition getBeanDefinition(String beanName);

    public abstract Object createBean(String beanName, BeanDefinition beanDefinition);

}
