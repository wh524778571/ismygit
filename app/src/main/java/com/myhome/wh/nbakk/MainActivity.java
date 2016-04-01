package com.myhome.wh.nbakk;


import android.os.Bundle;
import android.util.Log;


import com.myhome.wh.nbakk.entity.JsonBean;
import com.myhome.wh.nbakk.fragment.FragmentOne;
import com.myhome.wh.nbakk.fragment.FragmentTwo;
import com.myhome.wh.nbakk.fragment.FragmentThree;
import com.myhome.wh.nbakk.ui.IndicatorFragmentActivity;

import java.util.List;


public class MainActivity extends IndicatorFragmentActivity {
    public static final int FRAGMENT_ONE = 0;
    public static final int FRAGMENT_TWO = 1;
    public static final int FRAGMENT_THREE = 2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    /*
    * 给集合添加fragment元素
    * */
    @Override
    protected int supplyTabs(List<TabInfo> tabs) {

        tabs.add(new TabInfo(FRAGMENT_ONE, getString(R.string.fragment_one),
                FragmentOne.class));
        tabs.add(new TabInfo(FRAGMENT_TWO, getString(R.string.fragment_two),
                FragmentTwo.class));
        tabs.add(new TabInfo(FRAGMENT_THREE, getString(R.string.fragment_three),
                FragmentThree.class));
        return FRAGMENT_TWO;

    }

}
