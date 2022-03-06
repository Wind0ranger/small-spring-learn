package com.windranger.springframework.aop;

/**
 * Filter that restricts matching of a pointcut or introduction to
 * a given set of target classes.
 */
public interface ClassFilter {

    /**
     * 切入点是否匹配
     */
    boolean matches(Class<?> clazz);

}
