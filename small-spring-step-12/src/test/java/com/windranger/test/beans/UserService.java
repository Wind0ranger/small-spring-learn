package com.windranger.test.beans;

import java.util.Random;

public class UserService implements IUserService {

    public String queryUserInfo() {
        return "张三，100001，上海";
    }

    public String register(String userName) {
        return "注册用户：" + userName + " success！";
    }

}
