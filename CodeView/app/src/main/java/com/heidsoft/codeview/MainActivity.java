package com.heidsoft.codeview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextClock;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //创建线性布局管理器
        LinearLayout layout = new LinearLayout(this);
        //设置改Activity 显示layout
        setContentView(layout);
        layout.setOrientation(LinearLayout.VERTICAL);
        //创建一个TextView
        final TextView show = new TextView(this);
        //创建一个按钮
        Button btn = new Button(this);
        btn.setText(R.string.ok);
        btn.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT));
        //向layout容器添加按钮
        layout.addView(show);
        //向layout容器添加按钮
        layout.addView(btn);
        //为按钮绑定一个事件监听器
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show.setText("Heidsoft,Android Code view "+ new java.util.Date());
            }
        });

    }
}
