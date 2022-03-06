package com.windranger.springframework.aop;

/**
 * 切入点
 */
public interface Pointcut {

    /**
     * 获取 ClassFilter 数据
     */
    ClassFilter getClassFilter();

    /**
     * 获取 MethodMatcher 数据
     */
    MethodMatcher getMethodMatcher();

}
