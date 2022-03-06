package com.windranger.springframework.beans.factory;

import com.windranger.springframework.beans.BeansException;

public interface BeanFactoryAware extends Aware {

    void setBeanFactory(BeanFactory beanFactory) throws BeansException;

}
