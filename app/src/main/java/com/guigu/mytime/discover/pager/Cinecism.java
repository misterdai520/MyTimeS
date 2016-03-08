package com.guigu.mytime.discover.pager;

import android.app.Activity;
import android.view.View;

import com.guigu.mytime.R;
import com.guigu.mytime.base.BaseDiscoverPager;


/**
 * Created by chu on 2016/2/29.
 */
public class Cinecism extends BaseDiscoverPager {
    public Cinecism(Activity activity) {
        super(activity);

    }

    @Override
    public View initView() {

        View view = View.inflate(activity, R.layout.discover_listview,null);
        return view;
    }






}
