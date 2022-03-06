package com.windranger.springframework.beans.factory.support;

import com.windranger.springframework.beans.BeansException;
import com.windranger.springframework.core.io.Resource;
import com.windranger.springframework.core.io.ResourceLoader;

/**
 * Simple interface for bean definition readers.
 */
public interface BeanDefinitionReader {

    /**
     * 获取注册器
     */
    BeanDefinitionRegistry getRegistry();

    /**
     * 获取加载器
     */
    ResourceLoader getResourceLoader();

    void loadBeanDefinitions(Resource resource) throws BeansException;

    void loadBeanDefinitions(Resource... resources) throws BeansException;

    void loadBeanDefinitions(String location) throws BeansException;

    void loadBeanDefinitions(String... locations) throws BeansException;

}
