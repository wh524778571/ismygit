package com.myhome.wh.nbakk;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.PixelFormat;
import android.os.Bundle;

import android.os.Handler;
import android.os.PersistableBundle;
import android.view.WindowManager;
import android.widget.TextView;


/**
 * Created by Administrator on 2016/3/31 0031.
 */
public class splashScreen extends Activity {
    /*
    * RGBA_8888为android的一种32位颜色格式，R,G,B,A分别用八位表示，Android默认格式是PixelFormat.OPAQUE，
    * 其是不带Alpha值的。设置之后可以看到图片的显示效果就和在PC上看到一样，不会出现带状的轮廓线了。
    *   getWindow().setFormat(PixelFormat.RGBA_8888);解决渐变图片失真的问题
    * */

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

         getWindow().setFormat(PixelFormat.RGBA_8888);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_DITHER);//抖动
        setContentView(R.layout.splashscreen);
        //Display the current version number显示当前版本号
        PackageManager pm = getPackageManager();


        try {
            PackageInfo pi = pm.getPackageInfo("com.myhome.wh.nbakk", 0);
            TextView versionNumber = (TextView) findViewById(R.id.versionNumber);
            versionNumber.setText("Version " + pi.versionName);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }


        new Handler().postDelayed(new Runnable() {
            public void run() {
                /* Create an Intent that will start the Main WordPress Activity. */
                Intent mainIntent = new Intent(splashScreen.this, MainActivity.class);
                splashScreen.this.startActivity(mainIntent);
                splashScreen.this.finish();
            }
        }, 2900); //2900 后 发布

    }
}
