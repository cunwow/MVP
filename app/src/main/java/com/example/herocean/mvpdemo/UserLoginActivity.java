package com.example.herocean.mvpdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.herocean.mvpdemo.view.ILoginView;

public class UserLoginActivity extends AppCompatActivity implements ILoginView{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {

    }

    @Override
    public String getUserName() {
        return null;
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hindLoading() {

    }

    @Override
    public void gotoNextActivity() {

    }

    @Override
    public void showFailError() {

    }

    @Override
    public void clearUserName() {

    }

    @Override
    public void ClearPassword() {

    }
}
