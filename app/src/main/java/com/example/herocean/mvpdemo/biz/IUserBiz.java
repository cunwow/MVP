package com.example.herocean.mvpdemo.biz;

/**
 * Created by herocean on 2017/4/7.
 */
/*
   登录行为的实现类。
 */
public interface IUserBiz {

    public void login(String username,String password,OnLoginListener loginListener );

}
