package com.feicui.news.ui.adapter;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * 在 com.feicui.news.ui.adapter 包下新建 ViewPager 适配器
 LeadImgAdapter，该适配器继承 PagerAdapter。
  设置其构造方法，接收从外界传入的页卡样式集合。
  重写下述四个方法，设置每个页卡的显示界面。
 */
public class LeadImgAdapter extends PagerAdapter{
    private List<View> List;

    public LeadImgAdapter(List<View>list){
        this.List=list;
    }
    //设置控件中显示界面的数量
    @Override
    public int getCount() {
        return List.size();
    }
    /** 判断是否由对象生成界面*/
    @Override
    public boolean isViewFromObject(View arg0, Object arg1) {
        return arg0==(View) arg1;
    }
    /**销毁 position 位置的界面*/
    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView(List.get(position));
    }
    /** 初始化 position 位置的界面*/
    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View view=List.get(position);
        container.addView(view);
        return view;
    }
}
