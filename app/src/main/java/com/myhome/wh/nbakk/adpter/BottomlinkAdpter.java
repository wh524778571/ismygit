package com.myhome.wh.nbakk.adpter;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

import com.lidroid.xutils.BitmapUtils;
import com.myhome.wh.nbakk.R;
import com.myhome.wh.nbakk.entity.JsonBean;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Administrator on 2016/3/28 0028.
 */
public class BottomlinkAdpter extends BaseAdapter {

    Context context;
    BitmapUtils bitmapUtils;
    LayoutInflater layoutInflater;//反射器
    List<JsonBean.ResultBean.ListBean.BottomlinkBean> bottomlink;
    BottomlinkHolder bottomlinkHolder = null;
    GridView gridView;

    public BottomlinkAdpter(Context context, BitmapUtils bitmapUtils) {
        this.context = context;
        this.layoutInflater = LayoutInflater.from(context);
        this.bitmapUtils = bitmapUtils;
        this.bottomlink = new ArrayList<>();
    }

    public void setBottomlink(List<JsonBean.ResultBean.ListBean.BottomlinkBean> bottomlink) {
        this.bottomlink = bottomlink;
    }
    @Override
    public int getCount() {
        return bottomlink.size();
    }
    @Override
    public Object getItem(int position) {
        return bottomlink.get(position);
    }
    @Override
    public long getItemId(int position) {
        return position;
    }
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = layoutInflater.inflate(R.layout.list_item_fragment_bottomlink, null);
            gridView = (GridView) convertView.findViewById(R.id.gridview_fragment2_bottomlink);
            bottomlinkHolder = new BottomlinkHolder();
            bottomlinkHolder.text = (TextView) convertView.findViewById(R.id.textBottom);
            bottomlinkHolder.url = (TextView) convertView.findViewById(R.id.urlBottom);
            convertView.setTag(bottomlinkHolder);
        } else {
            bottomlinkHolder = (BottomlinkHolder) convertView.getTag();
        }
        bottomlinkHolder.text.setText(bottomlink.get(position).getText());
        bottomlinkHolder.url.setText(bottomlink.get(position).getUrl());
        bottomlinkHolder.text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = bottomlink.get(position).getUrl();
                getUrl(url);

            }
        });

        bottomlinkHolder.url.setVisibility(View.GONE);
        return convertView;
    }

    //根据url访问的方法
    public void getUrl(String url) {
        if (!url.equals("")) {//判断如果插入的赛事还未更新url为""时，避免报空指针异常做的判断
            Uri uri = Uri.parse(url);
            Intent it = new Intent(Intent.ACTION_VIEW, uri);
            context.startActivity(it);
        } else {
            Toast.makeText(context, "还没有相关赛事链接", Toast.LENGTH_SHORT).show();
        }
    }
}

class BottomlinkHolder {
    public TextView text;
    public TextView url;
}


