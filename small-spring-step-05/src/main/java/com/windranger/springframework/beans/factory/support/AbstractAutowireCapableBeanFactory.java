package com.windranger.springframework.beans.factory.support;

import cn.hutool.core.bean.BeanUtil;
import com.windranger.springframework.beans.BeansException;
import com.windranger.springframework.beans.PropertyValue;
import com.windranger.springframework.beans.PropertyValues;
import com.windranger.springframework.beans.factory.config.BeanDefinition;
import com.windranger.springframework.beans.factory.config.BeanReference;

import java.lang.reflect.Constructor;
import java.util.List;

public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory {

    private InstantiationStrategy instantiationStrategy = new SimpleInstantiationStrategy();

    public InstantiationStrategy getInstantiationStrategy() {
        return instantiationStrategy;
    }

    public void setInstantiationStrategy(InstantiationStrategy instantiationStrategy) {
        this.instantiationStrategy = instantiationStrategy;
    }

    @Override
    public Object createBean(String beanName, BeanDefinition beanDefinition, Object[] args) {
        Object bean = null;
        try {
            bean = createBeanInstance(beanName, beanDefinition, args);
            applyPropertyValues(beanName, bean, beanDefinition);
        } catch (Exception e) {
            throw new BeansException("Instantiation of bean failed", e);
        }
        return bean;
    }

    protected void applyPropertyValues(String beanName, Object bean, BeanDefinition beanDefinition) {
        PropertyValues propertyValues = beanDefinition.getPropertyValues();
        if (propertyValues == null) {
            return;
        }
        List<PropertyValue> propertyValueList = propertyValues.getPropertyValueList();
        if (propertyValueList == null) {
            return;
        }
        for (PropertyValue propertyValue : propertyValueList) {
            String name = propertyValue.getName();
            Object value = propertyValue.getValue();
            if (value instanceof BeanReference) {
                value = getBean(name);
            }
            BeanUtil.setProperty(bean, name, value);
        }
    }

    protected Object createBeanInstance(String beanName, BeanDefinition beanDefinition, Object[] args) {
        Class beanClass = beanDefinition.getBeanClass();
        Constructor ctorToUse = null;
        Constructor[] constructors = beanClass.getConstructors();
        for (Constructor constructor : constructors) {
            if (args != null && constructor.getParameterCount() == args.length) {
                ctorToUse = constructor;
                break;
            }
        }
        return getInstantiationStrategy().instantiate(beanDefinition, beanName, ctorToUse, args);
    }
}
