package com.feicui.news.ui;

import android.app.Fragment;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.feicui.news.R;
import com.feicui.news.ui.base.MyBaseActivity;

/**
 * Created by AAAAA on 2016/5/30.
 */
public class ActivityMain extends MyBaseActivity {
    private Fragment fragmentMenu,framgmentMenuRight;
    private Fragment fragmentType,fragmentMain,fragmentlogin,
            fragmentRegister,fragmentFavorite,fragmentForgetPass;
    private ImageView iv_set, iv_user;
    private TextView textView_title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
