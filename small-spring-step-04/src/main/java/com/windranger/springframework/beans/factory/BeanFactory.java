package com.windranger.springframework.beans.factory;

public interface BeanFactory {
    /**
     * 获取bean对象
     */
    Object getBean(String beanName);

    Object getBean(String beanName, Object... args);
}
