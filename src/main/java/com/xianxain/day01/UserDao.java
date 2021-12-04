package com.xianxain.day01;

public interface UserDao {
    void sava(User user);

    void queryUserByNameAndPassword(String name, String password);
}
