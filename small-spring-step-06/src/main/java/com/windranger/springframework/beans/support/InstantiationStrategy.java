package com.windranger.springframework.beans.support;

import com.windranger.springframework.beans.BeansException;
import com.windranger.springframework.beans.config.BeanDefinition;

import java.lang.reflect.Constructor;

public interface InstantiationStrategy {

    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args) throws BeansException;

}
