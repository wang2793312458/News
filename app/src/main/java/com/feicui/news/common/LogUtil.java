package com.feicui.news.common;

import android.util.Log;

/**
 * Created by AAAAA on 2016/5/30.
 * 日志管理
 */
public class LogUtil {
    public static final String TAG="新闻随意看";
    private static boolean isDebug=true;

    ////调试日志的开关
    public static void d(String tag,String msg){
        
        if (isDebug)
            Log.d(tag, msg);
    }
    public static void d(String msg){
        if (isDebug)
            Log.d(LogUtil.TAG,msg);
    }
}
