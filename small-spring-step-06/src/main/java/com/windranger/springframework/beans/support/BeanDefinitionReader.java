package com.windranger.springframework.beans.support;

import com.windranger.springframework.beans.BeansException;
import com.windranger.springframework.core.io.Resource;
import com.windranger.springframework.core.io.ResourceLoader;

public interface BeanDefinitionReader {

    BeanDefinitionRegistry getRegistry();

    ResourceLoader getResourceLoader();

    void loadBeanDefinitions(Resource resource) throws BeansException;

    void loadBeanDefinitions(Resource... resources) throws BeansException;

    void loadBeanDefinitions(String location) throws BeansException;

    void loadBeanDefinitions(String... locations) throws BeansException;

}
