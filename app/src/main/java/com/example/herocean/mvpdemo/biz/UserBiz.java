package com.example.herocean.mvpdemo.biz;

import android.text.TextUtils;

import com.example.herocean.mvpdemo.bean.User;

/**
 * Created by herocean on 2017/4/7.
 */
/*
    登录行为的接口。
 */
public class UserBiz implements IUserBiz {

    @Override
    public void login(final String username, final String password, final OnLoginListener loginListener) {
        new Thread(){
            @Override
            public void run() {
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (TextUtils.equals("nick",username) && TextUtils.equals("123",password) ) {
                    User user = new User();
                    user.setUsername(username);
                    user.setPassword(password);
                    loginListener.loginSuccess(user);

                }else{
                    loginListener.loginFeiled();
                }
            }
        }.start();
    }

}
