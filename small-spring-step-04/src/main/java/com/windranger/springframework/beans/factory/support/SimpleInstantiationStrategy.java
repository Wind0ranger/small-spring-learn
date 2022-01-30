package com.windranger.springframework.beans.factory.support;

import com.windranger.springframework.beans.BeansException;
import com.windranger.springframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SimpleInstantiationStrategy implements InstantiationStrategy {

    @Override
    public Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor constructor, Object[] args) throws BeansException {
        Object o = null;
        try {
            if (constructor != null) {
                o = constructor.newInstance(args);
            } else {
                o = beanDefinition.getBeanClass().newInstance();
            }
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
            throw new BeansException("创建bean异常");
        }
        return o;
    }
}
