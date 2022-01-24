package com.windranger.springframework.beans.factory.support;

import com.windranger.springframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;
import java.util.Objects;

public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory {

    InstantiationStrategy instantiationStrategy = new SimpleInstantiationStrategy();

    @Override
    public Object createBean(String beanName, BeanDefinition beanDefinition, Object[] args) {
        return createBeanInstance(beanDefinition, beanName, args);
    }

    protected Object createBeanInstance(BeanDefinition beanDefinition, String beanName, Object[] args) {
        Constructor constructorToUse = null;
        Class<?> beanClass = beanDefinition.getBeanClass();
        Constructor<?>[] declaredConstructors = beanClass.getDeclaredConstructors();
        for (Constructor ctor : declaredConstructors) {
            if (null != args && ctor.getParameterTypes().length == args.length) {
                constructorToUse = ctor;
                break;
            }
        }
        return getInstantiationStrategy().instantiate(beanDefinition, beanName, constructorToUse, args);
    }

    public InstantiationStrategy getInstantiationStrategy() {
        return instantiationStrategy;
    }

    public void setInstantiationStrategy(InstantiationStrategy instantiationStrategy) {
        this.instantiationStrategy = instantiationStrategy;
    }
}
