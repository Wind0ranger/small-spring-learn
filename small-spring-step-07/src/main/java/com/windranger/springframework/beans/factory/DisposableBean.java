package com.windranger.springframework.beans.factory;

public interface DisposableBean {

    void destroy() throws Exception;

}