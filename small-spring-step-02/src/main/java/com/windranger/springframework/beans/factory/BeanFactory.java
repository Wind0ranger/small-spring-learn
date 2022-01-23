package com.windranger.springframework.beans.factory;

public interface BeanFactory {
    /**
     * 获取bean实例
     *
     * @param beanName 实例名称
     * @return 返回对象
     */
    Object getBean(String beanName) throws InstantiationException, IllegalAccessException;
}
