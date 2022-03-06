package com.windranger.springframework.aop;

import java.lang.reflect.Method;

/**
 * 检查目标方法是否符合条件
 */
public interface MethodMatcher {

    /**
     * 检查该方法是否匹配
     */
    boolean matches(Method method, Class<?> targetClass);

}
