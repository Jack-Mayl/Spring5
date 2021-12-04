package com.xianxain.day01;
//工厂类
public class BeanFactory {
    /**
     * 工厂方法
     * @return
     */
    public static UserService getUserService(){
        return new UserServiceImpl();
    }
}
