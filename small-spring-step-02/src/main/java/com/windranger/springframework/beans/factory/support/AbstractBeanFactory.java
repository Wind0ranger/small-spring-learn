package com.windranger.springframework.beans.factory.support;

import com.windranger.springframework.beans.factory.BeanFactory;
import com.windranger.springframework.beans.factory.config.BeanDefinition;

import java.util.Objects;

/**
 * @author barry
 */
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
     * @param beanName
     * @return
     */
    public abstract BeanDefinition getBeanDefinition(String beanName);

    /**
     * 创建 bean对象
     *
     * @param beanName
     * @param beanDefinition
     * @return
     */
    public abstract Object createBean(String beanName, BeanDefinition beanDefinition);

}
