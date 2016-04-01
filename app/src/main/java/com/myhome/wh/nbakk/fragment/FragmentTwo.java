package com.myhome.wh.nbakk.fragment;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.lidroid.xutils.BitmapUtils;
import com.lidroid.xutils.bitmap.PauseOnScrollListener;
import com.myhome.wh.nbakk.R;
import com.myhome.wh.nbakk.adpter.BottomlinkAdpter;

import com.myhome.wh.nbakk.adpter.NBAAdapter;
import com.myhome.wh.nbakk.entity.JsonBean;
import com.myhome.wh.nbakk.util.JsonUtil;
import com.myhome.wh.nbakk.view.XListView;
import com.thinkland.sdk.android.DataCallBack;
import com.thinkland.sdk.android.JuheData;
import com.thinkland.sdk.android.Parameters;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


public class FragmentTwo extends Fragment implements View.OnClickListener, XListView.IXListViewListener {
    private List<JsonBean.ResultBean.ListBean.TrBean> tr;

    XListView listView;
    GridView gridViewBottomlink;

    TextView titleTv;//顶部日期

    TextView textTv1;
    TextView textTv2;
    private NBAAdapter nbaAdapter;
    private BottomlinkAdpter bottomlinkAdpter;

    private String url2;
    private String text2;
    private String url1;
    private String text1;
    private TextView liveurl;
    private TextView player1;
    private TextView player1info;
    private TextView player1location;
    private ImageView player1logobig;
    private TextView player1url;
    private TextView player2;
    private TextView player2info;
    private TextView player2location;
    private ImageView player2logobig;
    private TextView player2url;
    private TextView score;
    private TextView status;
    private TextView title1;

    private Button livebut;

    BitmapUtils bitmapUtils;
    private View view;
    private View viewHeader;

    List<JsonBean.ResultBean.ListBean.LiveBean> live;
    private ImageView imageView;
    private RelativeLayout imageRl;


    public FragmentTwo() {
        super();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.listview_fragment2, null);
        viewHeader = inflater.inflate(R.layout.list_item_fragment2_live, null);

        init();

        //图片处理
        bitmapUtils = new BitmapUtils(getContext());
        /*默认是加载的背景图片*/
        bitmapUtils.configDefaultLoadingImage(R.drawable.sx);
        /*加载失败是的图片*/
        bitmapUtils.configDefaultLoadFailedImage(R.drawable.sx);
        /*加载压缩的图片*/
        bitmapUtils.configDefaultBitmapConfig(Bitmap.Config.RGB_565);
        /** 滑动加载图片时，快速滑过的时候不用加载
         * 第一个值：bitmapUtils,当前加载图片的对象
         * 第二个值：false:触摸滚动的时候暂停加载{@linkplain BitmapUtils#pause() pause loading} during touch scrolling
         * 第三个值：true:停顿加载，{@linkplain BitmapUtils#pause() pause loading} during fling
         * */
        listView.setOnScrollListener(new PauseOnScrollListener(bitmapUtils, false, true));

        bitmapUtils.configMemoryCacheEnabled(false);
        bitmapUtils.configDiskCacheEnabled(true);


        nbaAdapter = new NBAAdapter(getContext(), bitmapUtils);
        listView.setAdapter(nbaAdapter);
        listView.setXListViewListener(this);
        listView.setPullLoadEnable(false);//关闭加载更多的功能


        bottomlinkAdpter = new BottomlinkAdpter(getContext(), bitmapUtils);
        gridViewBottomlink.setAdapter(bottomlinkAdpter);

        //隐藏不需要url显示
        player1url.setVisibility(View.GONE);
        player2url.setVisibility(View.GONE);
        status.setVisibility(View.GONE);
        liveurl.setVisibility(View.GONE);


        //点击事件
        textTv1.setOnClickListener(this);
        textTv2.setOnClickListener(this);
        //点击事件
        player1logobig.setOnClickListener(this);
        player2logobig.setOnClickListener(this);

        livebut.setOnClickListener(this);
        getNBA();//聚合

        return view;
    }

    public void init() {
        listView = (XListView) view.findViewById(R.id.listview_fragment2_tr);
        listView.addHeaderView(viewHeader);//listview中加headerview

        gridViewBottomlink = (GridView) view.findViewById(R.id.gridview_fragment2_bottomlink);
        textTv1 = (TextView) view.findViewById(R.id.textTv1);//live 视频集锦
        textTv2 = (TextView) view.findViewById(R.id.textTv2);//live 技术统计
        titleTv = (TextView) view.findViewById(R.id.title);//头部日期

        liveurl = (TextView) viewHeader.findViewById(R.id.liveurl);
        player1 = (TextView) viewHeader.findViewById(R.id.player1);
        player1info = (TextView) viewHeader.findViewById(R.id.player1info);
        player1location = (TextView) viewHeader.findViewById(R.id.player1location);
        player1logobig = (ImageView) viewHeader.findViewById(R.id.player1logobig);
        player1url = (TextView) viewHeader.findViewById(R.id.player1url);
        player2 = (TextView) viewHeader.findViewById(R.id.player2);
        player2info = (TextView) viewHeader.findViewById(R.id.player2info);
        player2location = (TextView) viewHeader.findViewById(R.id.player2location);
        player2logobig = (ImageView) viewHeader.findViewById(R.id.player2logobig);
        player2url = (TextView) viewHeader.findViewById(R.id.player2url);
        score = (TextView) viewHeader.findViewById(R.id.score);
        status = (TextView) viewHeader.findViewById(R.id.status);
        title1 = (TextView) viewHeader.findViewById(R.id.title);

        livebut = (Button) viewHeader.findViewById(R.id.livebut);
        imageView = (ImageView) view.findViewById(R.id.image);
        imageRl = (RelativeLayout) view.findViewById(R.id.imageRl);


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

                                if (ilist == 1) {
                                    String title = list.get(ilist).getTitle();
                                    titleTv.setText(title);
                                    tr = list.get(ilist).getTr();

                                    Thread thread = new Thread(new Runnable() {

                                        @Override
                                        public void run() {
                                            Log.i("s11111", Thread.currentThread().getName() + ": " + Thread.currentThread().getId());
                                            System.out.println(Thread.currentThread().getName() + ": " + Thread.currentThread().getId());
                                            nbaAdapter.setTr(tr);
                                            nbaAdapter.notifyDataSetChanged();//通知更新
                                            onLoadComplete();
                                        }
                                    });
                                    thread.start();
                                    imageView.setVisibility(View.GONE);
                                    imageRl.setVisibility(View.GONE);

                                    List<JsonBean.ResultBean.ListBean.LiveBean> live = list.get(ilist).getLive();
                                    for (int ilive = 0; ilive < live.size(); ilive++) {
                                        String liveurlfind = live.get(ilive).getLiveurl();
                                        Log.i("111", liveurlfind);
                                        if (!liveurlfind.equals("")) {
                                            Toast.makeText(getContext(), "正在直播", Toast.LENGTH_SHORT).show();
                                        } else {
                                            livebut.setVisibility(View.GONE);

                                        }

                                        liveurl.setText(liveurlfind);
                                        player1.setText(live.get(ilive).getPlayer1());
                                        player1info.setText(live.get(ilive).getPlayer1info());
                                        player1location.setText(live.get(ilive).getPlayer1location());
                                        bitmapUtils.display(player1logobig, live.get(ilive).getPlayer1logobig());
                                        player1url.setText(live.get(ilive).getPlayer1url());

                                        player2.setText(live.get(ilive).getPlayer2());
                                        player2info.setText(live.get(ilive).getPlayer2info());
                                        player2location.setText(live.get(ilive).getPlayer2location());
                                        bitmapUtils.display(player2logobig, live.get(ilive).getPlayer2logobig());
                                        player2url.setText(live.get(ilive).getPlayer2url());
                                        score.setText(live.get(ilive).getScore());
                                        status.setTextSize(live.get(ilive).getStatus());
                                        title1.setText(live.get(ilive).getTitle());

                                    }


                                    List<JsonBean.ResultBean.ListBean.LivelinkBean> livelink = list.get(ilist).getLivelink();
                                    text1 = livelink.get(0).getText();
                                    url1 = livelink.get(0).getUrl();
                                    text2 = livelink.get(1).getText();
                                    url2 = livelink.get(1).getUrl();
                                    textTv1.setText(text1);
                                    textTv2.setText(text2);

                                    List<JsonBean.ResultBean.ListBean.BottomlinkBean> bottomlink = list.get(ilist).getBottomlink();
                                    bottomlinkAdpter.setBottomlink(bottomlink);
                                    bottomlinkAdpter.notifyDataSetChanged();//通知更新

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

    //根据url访问的方法
    public void getUrl(String url) {

        if (!url.equals("")) {//判断如果插入的赛事还未更新url为""时，避免报空指针异常做的判断
            Uri uri = Uri.parse(url);
            Intent it = new Intent(Intent.ACTION_VIEW, uri);
            getContext().startActivity(it);
        } else {
            Toast.makeText(getContext(), "还没有相关赛事链接", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.textTv1:
                getUrl(url1);
                break;
            case R.id.textTv2:
                getUrl(url2);
                break;
            case R.id.player1logobig:
                getUrl(player1url.getText().toString() + "&cid=100000");
                break;
            case R.id.player2logobig:
                getUrl(player2url.getText().toString() + "&cid=100000");
                break;
            case R.id.livebut:
                getUrl(liveurl.getText().toString());
        }
    }

    Handler handler = new Handler();

    //xlistview
    @Override
    public void onRefresh() {
        //刷新
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                nbaAdapter.setTr(tr);
                nbaAdapter.notifyDataSetChanged();
                onLoadComplete();
            }
        }, 2000);

    }

    @Override
    public void onLoadMore() {
        //加载更多

    }

    //加载完毕
    public void onLoadComplete() {
        listView.stopRefresh();
        listView.stopLoadMore();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss ");
        Date curDate = new Date(System.currentTimeMillis());//获取当前时间
        String str = formatter.format(curDate);
        listView.setRefreshTime(str);
    }
}
