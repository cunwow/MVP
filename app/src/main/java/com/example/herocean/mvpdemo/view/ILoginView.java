package com.example.herocean.mvpdemo.view;

/**
 * Created by herocean on 2017/4/7.
 */

public interface ILoginView  {

    String getUserName();
    String getPassword();

    void showLoading();
    void hindLoading();

    void gotoNextActivity();
    void showFailError();

    void clearUserName();
    void ClearPassword();

}
