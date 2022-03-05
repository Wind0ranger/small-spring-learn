package com.windranger.springframework.context;

import com.windranger.springframework.beans.BeansException;
import com.windranger.springframework.beans.factory.Aware;

public interface ApplicationContextAware extends Aware {

    void setApplicationContext(ApplicationContext applicationContext) throws BeansException;

}
    