package com.myhome.wh.nbakk.fragment;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.lidroid.xutils.BitmapUtils;
import com.myhome.wh.nbakk.R;
import com.myhome.wh.nbakk.adpter.NBAAdapter;
import com.myhome.wh.nbakk.entity.JsonBean;
import com.myhome.wh.nbakk.util.JsonUtil;
import com.thinkland.sdk.android.DataCallBack;
import com.thinkland.sdk.android.JuheData;
import com.thinkland.sdk.android.Parameters;

import java.util.List;


public class FragmentThree extends Fragment {

    ListView listView;
    NBAAdapter nbaAdapter;
    TextView titleTv;



    public FragmentThree() {
        super();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.listview_fragment3, null);

        titleTv = (TextView) view.findViewById(R.id.title);

       listView = (ListView) view.findViewById(R.id.listview_fragment3);

        TextView tv= (TextView) view.findViewById(R.id.tv);
        tv.setText("THREE");
        BitmapUtils bitmapUtils = new BitmapUtils(getContext());
        bitmapUtils.configDefaultLoadFailedImage(R.drawable.xlistview_arrow);
        bitmapUtils.configDefaultLoadFailedImage(R.drawable.xlistview_arrow);
        bitmapUtils.configDefaultBitmapConfig(Bitmap.Config.RGB_565);

        bitmapUtils.configMemoryCacheEnabled(false);
        bitmapUtils.configDiskCacheEnabled(true);


        nbaAdapter = new NBAAdapter(getContext(), bitmapUtils);
        listView.setAdapter(nbaAdapter);
        getNBA();//聚合


        return view;


    }

    /*
* 聚合
* */
    public void getNBA() {

        String url = "http://op.juhe.cn/onebox/basketball/nba";
        //调用接口的参数
        final Parameters parameters = new Parameters();

        parameters.add("dtype", "json");
        /**
         * 请求的方法 参数: 第一个参数 当前请求的context;
         * 				  第二个参数 接口id;
         * 				  第三个参数 接口请求的url;
         * 				  第四个参数 接口请求的方式;
         * 				  第五个参数 接口请求的参数,键值对com.thinkland.sdk.android.Parameters类型;
         * 				  第六个参数请求的回调方法,com.thinkland.sdk.android.DataCallBack;
         *
         */

        JuheData.executeWithAPI(getContext(), 92, url, JuheData.GET, parameters, new DataCallBack() {


                    /**
                     * 请求成功时调用的方法 statusCode为http状态码,responseString为请求返回数据.
                     */
                    @Override
                    public void onSuccess(int statusCode, String responseString) {

                        List<JsonBean> nbaList = JsonUtil.getNBAList(responseString);
                        List<JsonBean.ResultBean.ListBean> list;

                        for (int i = 0; i < nbaList.size(); i++) {
                            JsonBean.ResultBean result = nbaList.get(i).getResult();
                            list = result.getList();

                            for (int ilist = 0; ilist < list.size(); ilist++) {

                                if (ilist == 2) {
                                    String title = list.get(ilist).getTitle();
                                    titleTv.setText(title);

                                    List<JsonBean.ResultBean.ListBean.TrBean> tr = list.get(ilist).getTr();
                                    nbaAdapter.setTr(tr);
                                    nbaAdapter.notifyDataSetChanged();//通知更新

                                }


                            }

                        }


                    }

                    /**
                     * 请求完成时调用的方法,无论成功或者失败都会调用.
                     */
                    @Override
                    public void onFinish() {
                      //  Toast.makeText(getContext(), "请求完成(无论成功失败调用)", Toast.LENGTH_SHORT).show();
                    }

                    /**
                     * 请求失败时调用的方法,statusCode为http状态码,throwable为捕获到的异常
                     * statusCode:30002 没有检测到当前网络.
                     * 			  30003 没有进行初始化.
                     * 			  0 未明异常,具体查看Throwable信息.
                     * 			  其他异常请参照http状态码.
                     */
                    @Override
                    public void onFailure(int statusCode, String responseString, Throwable throwable) {

                    }
                }

        );
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        /**
         * 关闭当前页面正在进行中的请求.
         */
        JuheData.cancelRequests(getContext());
    }


}
