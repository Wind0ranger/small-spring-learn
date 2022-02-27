package com.windranger.springframework.beans.factory;


import com.windranger.springframework.beans.BeansException;

/**
 * 实现此接口，既能感知到所属的 BeanFactory
 */
public interface BeanFactoryAware extends Aware {

    void setBeanFactory(BeanFactory beanFactory) throws BeansException;

}
