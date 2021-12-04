package com.xianxain.day01;

public class UserServiceImpl implements UserService{
    private UserDao userDAO=new UserDAOImpl();

    /**
     *注册
     * @param user 用户信息
     */
    @Override
    public void register(User user) {
        //调用sava进行保存
        userDAO.sava(user);
    }

    /**
     * 登录
     * @param name   用户的姓名
     * @param password  用户的年龄
     */
    @Override
    public void login(String name, String password) {
        //用户名和密码的查询
        userDAO.queryUserByNameAndPassword(name,password);
    }
}
