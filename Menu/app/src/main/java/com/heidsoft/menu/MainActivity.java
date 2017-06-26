package com.heidsoft.menu;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button1 = (Button)findViewById(R.id.bn1);

        Button button2 = (Button)findViewById(R.id.bn2);

        Button button3 = (Button)findViewById(R.id.bn3);

        Button button4 = (Button)findViewById(R.id.bn4);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //这种方式，叫做显示意图
                Intent intent = new Intent(MainActivity.this,ActivityTable.class);
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //这种方式，叫做显示意图
                Intent intent = new Intent(MainActivity.this,TableViewActivity.class);
                startActivity(intent);
            }
        });

        //拨打电话
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //这种方式，叫做显示意图
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:10086"));
                startActivity(intent);
            }
        });

        //打开百度
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //这种方式，叫做显示意图
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://www.baidu.com"));
                startActivity(intent);
            }
        });
    }
}
