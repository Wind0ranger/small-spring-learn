package com.windranger.springframework.beans.factory.config;

/**
 * @author barry
 */
public class BeanDefinition {

    public Class beanClass;

    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }
}
