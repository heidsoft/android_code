package com.heidsoft.customview;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;

public class CustomView extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_view);

        //获取布局文件中LinearLayout容器
        LinearLayout root = (LinearLayout)findViewById(R.id.root);
        //创建DrawView组件
        final DrawView drawView = new DrawView(this);
        //设置自定义组件的最大宽度、高度
        drawView.setMinimumHeight(300);
        drawView.setMinimumHeight(500);
        root.addView(drawView);
    }
}
