package com.windranger.springframework.context;

import com.windranger.springframework.beans.factory.HierarchicalBeanFactory;
import com.windranger.springframework.beans.factory.ListableBeanFactory;
import com.windranger.springframework.core.io.ResourceLoader;

/**
 * 应用上下文
 */
public interface ApplicationContext extends ListableBeanFactory, HierarchicalBeanFactory, ResourceLoader, ApplicationEventPublisher {
}
