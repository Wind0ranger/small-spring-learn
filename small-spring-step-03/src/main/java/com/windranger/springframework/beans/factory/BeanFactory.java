package com.windranger.springframework.beans.factory;

public interface BeanFactory {

    /**
     * 获取bean
     */
    Object getBean(String beanName);

    /**
     * 获取bean，参数不固定
     */
    Object getBean(String beanName, Object... args);
}
