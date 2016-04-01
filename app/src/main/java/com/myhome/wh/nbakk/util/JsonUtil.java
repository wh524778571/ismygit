package com.myhome.wh.nbakk.util;

import android.util.Log;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.myhome.wh.nbakk.entity.JsonBean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;


/**
 * Created by Administrator on 2016/3/13 0013.
 */
public class JsonUtil {

    /*
    * 赛事查询
    * */
    public static List<JsonBean> getNBAList(String json) {
        List<JsonBean> listAll = new ArrayList<>();
        JsonBean jsonBean = JSON.parseObject(json, JsonBean.class);
        JSONObject jsonObject = JSON.parseObject(json);

        String result = jsonObject.get("result").toString();
        JsonBean.ResultBean resultBean = JSON.parseObject(result, JsonBean.ResultBean.class);
        JSONObject jsonObjectResult = JSON.parseObject(result);
        String statuslist = jsonObjectResult.getString("statuslist");
        JsonBean.ResultBean.StatuslistBean statuslistBean = JSON.parseObject(statuslist, JsonBean.ResultBean.StatuslistBean.class);

        String list = jsonObjectResult.get("list").toString();
        JSONArray jsonArrayList = JSON.parseArray(list);
        for (int iList = 0; iList < jsonArrayList.size(); iList++) {
            String StringList = jsonArrayList.get(iList).toString();
            JsonBean.ResultBean.ListBean listBean = JSON.parseObject(StringList, JsonBean.ResultBean.ListBean.class);
            JSONObject jsonObjectList = JSON.parseObject(StringList);

            if (iList == 1) {
                String toStringLive = jsonObjectList.get("live").toString();
                JSONArray jsonArrayLive = JSON.parseArray(toStringLive);
                for (int ilive = 0; ilive < jsonArrayLive.size(); ilive++) {
                    String stringLive = jsonArrayLive.get(ilive).toString();
                    JsonBean.ResultBean.ListBean.LiveBean liveBean = JSON.parseObject(stringLive, JsonBean.ResultBean.ListBean.LiveBean.class);
                   Log.i("liveBean",liveBean.getLiveurl());
                }
                String toStringLivelink = jsonObjectList.get("livelink").toString();
                JSONArray jsonArrayLivelink = JSON.parseArray(toStringLivelink);
                for (int ilivelink = 0; ilivelink < jsonArrayLivelink.size(); ilivelink++) {
                    String stringLivelink = jsonArrayLivelink.get(ilivelink).toString();
                    JsonBean.ResultBean.ListBean.LivelinkBean livelinkBean = JSON.parseObject(stringLivelink, JsonBean.ResultBean.ListBean.LivelinkBean.class);
                  //  Log.i("livelinkBean", livelinkBean.getText() + livelinkBean.getUrl());
                }
            }

            String toStringTr = jsonObjectList.get("tr").toString();
            JSONArray jsonArrayTr = JSON.parseArray(toStringTr);
            for (int itr = 0; itr < jsonArrayTr.size(); itr++) {
                String stringTr = jsonArrayTr.get(itr).toString();
                JsonBean.ResultBean.ListBean.TrBean trBean = JSON.parseObject(stringTr, JsonBean.ResultBean.ListBean.TrBean.class);
                // Log.i("tr",trBean.getLink1text()+trBean.getLink1url());
            }
            String toStringbottomlink = jsonObjectList.get("bottomlink").toString();
            JSONArray jsonArrayBottomlink = JSON.parseArray(toStringbottomlink);
            for (int ibottomlink = 0; ibottomlink < jsonArrayBottomlink.size(); ibottomlink++) {
                String stringbottomlink = jsonArrayBottomlink.get(ibottomlink).toString();
                JsonBean.ResultBean.ListBean.BottomlinkBean bottomlinkBean = JSON.parseObject(stringbottomlink, JsonBean.ResultBean.ListBean.BottomlinkBean.class);
                // Log.i("bottomlinkBean", bottomlinkBean.getText());
            }
        }

        String teammatch = jsonObjectResult.get("teammatch").toString();
        JSONArray jsonArrayTeammatch = JSON.parseArray(teammatch);
        for (int iTeammatch = 0; iTeammatch < jsonArrayTeammatch.size(); iTeammatch++) {
            String StringTeammatch = jsonArrayTeammatch.get(iTeammatch).toString();
            JsonBean.ResultBean.TeammatchBean teammatchBean = JSON.parseObject(StringTeammatch, JsonBean.ResultBean.TeammatchBean.class);
            // Log.i("ttt", teammatchBean.getName());
        }
        listAll.add(jsonBean);
        return listAll;

    }
}
