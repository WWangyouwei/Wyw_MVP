package com.dell.wyw_mvp.presenter;

import com.dell.wyw_mvp.view.activity.MainActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * 姓名：王有为
 * 时间：2017/9/27.
 */

public class HomePresenter {

    private static InitDataClicker initDataClicker;
    private static ArrayList<String> list = new ArrayList<>();
//    public static void setCallBack(InitDataClicker callBack) {
//        initDataClicker = callBack;
//    }

    public static void doCallBackMethod(InitDataClicker callBack){
        initDataClicker = callBack;
        list=new ArrayList<>();
        for (int i =0;i<15;i++){
            list.add(""+i);
        }
        initDataClicker.success(list);
    }
}
