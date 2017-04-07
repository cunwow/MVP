package com.example.herocean.mvpdemo.biz;

import com.example.herocean.mvpdemo.bean.User;

/**
 * Created by herocean on 2017/4/7.
 */

interface OnLoginListener {

    void loginSuccess(User user);

    void loginFeiled();

}
