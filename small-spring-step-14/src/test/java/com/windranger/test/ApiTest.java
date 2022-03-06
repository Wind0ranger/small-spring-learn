package com.windranger.test;


import com.windranger.springframework.context.support.ClassPathXmlApplicationContext;
import com.windranger.test.bean13.IUserService;
import org.junit.Test;

public class ApiTest {

    @Test
    public void test_scan() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring-scan.xml");
        IUserService userService = applicationContext.getBean("userService", IUserService.class);
        System.out.println("测试结果：" + userService.queryUserInfo());
    }


}
