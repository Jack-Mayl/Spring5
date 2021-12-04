package com.xianxain.day01;

public interface UserService {
    /**
     * 注册的方法
     * @param user 用户信息
     */
    public void register(User user);

    /**
     * 登录的方法
     * @param name   用户的姓名
     * @param password  用户的年龄
     */
    public void login(String name,String password);
}
