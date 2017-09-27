package com.dell.wyw_mvp.view.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.dell.wyw_mvp.R;
import com.dell.wyw_mvp.presenter.HomePresenter;
import com.dell.wyw_mvp.presenter.InitDataClicker;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements InitDataClicker{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        HomePresenter.setCallBack(this);
        HomePresenter.doCallBackMethod(this);
    }


    @Override
    public void success(ArrayList<String> list) {
        for (int i = 0;i<list.size();i++){
            Log.e("传回数据是：",""+i);
        }
    }
}
