package com.feicui.news.ui.base;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;

import com.feicui.news.common.LogUtil;

/**
 * Created by AAAAA on 2016/5/30.
 */
public class MyBaseActivity extends Activity {
    private Toast toast;
    protected int screen_w, screen_h;
    public Dialog dialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        screen_w = getWindowManager().getDefaultDisplay().getWidth();
        screen_h = getWindowManager().getDefaultDisplay().getHeight();
    }

    @Override
    protected void onStart() {
        super.onStart();
        LogUtil.d(LogUtil.TAG, getClass().getSimpleName() + "onStart() ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        LogUtil.d(LogUtil.TAG, getClass().getSimpleName() + "onRestart() ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        LogUtil.d(LogUtil.TAG, getClass().getSimpleName() + "onResume() ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        LogUtil.d(LogUtil.TAG, getClass().getSimpleName() + "onPause() ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        LogUtil.d(LogUtil.TAG, getClass().getSimpleName() + "onStop() ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        LogUtil.d(LogUtil.TAG, getClass().getSimpleName() + "onDestroy() ");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        LogUtil.d(LogUtil.TAG, getClass().getSimpleName() + "onSaveInstanceState() ");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        LogUtil.d(LogUtil.TAG, getClass().getSimpleName()
                + "onRestoreInstanceState() ");
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        LogUtil.d(LogUtil.TAG, getClass().getSimpleName()
                + "onConfigurationChanged() ");
    }

    /************************** 公共功能封装****************************************/
    public void showToast(int resId) {
        showToast(getString(resId));
    }

    public void showToast(String msg) {
        if (toast == null)
            toast = Toast.makeText(this, msg, Toast.LENGTH_SHORT);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setText(msg);
        toast.show();
    }
    //通过 class 名字进行界面跳转
    public void openActivity(Class<?> pClass) {
        openActivity(pClass, null, null);
    }

    //通过 class 名字进行界面跳转只带 Bundle 数据
    public void openActivity(Class<?> pClass, Bundle bundle) {
        openActivity(pClass, bundle, null);
    }

    //通过 class 名字进行界面跳转并带 Bundle， Uri 数据
    public void openActivity(Class<?> pClass, Bundle bundle, Uri uri) {
        Intent intent = new Intent(this, pClass);
        if (bundle != null)
            intent.putExtras(bundle);
        if (uri != null)
            intent.setData(uri);
            startActivity(intent);

    }

    //通过 action 字符串进行界面跳转
    public void openActivity(String action) {
        openActivity(action, null, null);
    }

    //通过 action 字符串进行界面跳转，只带 Bundle 数据
    public void openActivity(String action, Bundle bundle) {
        openActivity(action, bundle, null);
    }

    //通过 action 字符串进行界面跳转，并带 Bundle 和 Url 数据
    public void openActivity(String action, Bundle bundle, Uri uri) {
        Intent intent = new Intent(action);
        if (bundle != null)
            intent.putExtras(bundle);
        if (uri != null)
            intent.setData(uri);
        startActivity(intent);
    }


}
