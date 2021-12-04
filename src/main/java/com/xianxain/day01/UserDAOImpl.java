package com.xianxain.day01;

public class UserDAOImpl implements UserDao{
    //因为是测试所以这里只是用了输出来验证 而不是联合Mybatis
    @Override
    public void sava(User user) {
        System.out.println("insert into user=" + user);
    }

    @Override
    public void queryUserByNameAndPassword(String name, String password) {
        System.out.println("query User name = "+ name +" password = "+password);
    }
}
