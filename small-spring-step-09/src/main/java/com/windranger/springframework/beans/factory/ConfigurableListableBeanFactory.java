package com.windranger.springframework.beans.factory;

import com.windranger.springframework.beans.BeansException;
import com.windranger.springframework.beans.factory.config.AutowireCapableBeanFactory;
import com.windranger.springframework.beans.factory.config.BeanDefinition;
import com.windranger.springframework.beans.factory.config.BeanPostProcessor;
import com.windranger.springframework.beans.factory.config.ConfigurableBeanFactory;

public interface ConfigurableListableBeanFactory extends ListableBeanFactory, AutowireCapableBeanFactory, ConfigurableBeanFactory {

    BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    void preInstantiateSingletons() throws BeansException;

    void addBeanPostProcessor(BeanPostProcessor beanPostProcessor);

}
