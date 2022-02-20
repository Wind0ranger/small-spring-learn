package com.windranger.springframework.beans.factory.config;

import com.windranger.springframework.beans.BeansException;

/**
 * @author barry
 */
public class BeanDefinition extends BeansException {

    private Class beanClass;

    public BeanDefinition(Class clazz) {
        this.beanClass = clazz;
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }
}
