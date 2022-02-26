package com.windranger.common;

import com.windranger.springframework.beans.BeansException;
import com.windranger.springframework.beans.PropertyValue;
import com.windranger.springframework.beans.PropertyValues;
import com.windranger.springframework.beans.config.BeanDefinition;
import com.windranger.springframework.beans.config.BeanFactoryPostProcessor;
import com.windranger.springframework.beans.factory.ConfigurableListableBeanFactory;

public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

        BeanDefinition beanDefinition = beanFactory.getBeanDefinition("userService");
        PropertyValues propertyValues = beanDefinition.getPropertyValues();

        propertyValues.addPropertyValue(new PropertyValue("company", "改为：唯品金融"));
    }

}
