package com.heidsoft.a01_hello_world;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //使用activity_main作为布局
        setContentView(R.layout.activity_main);
    }

    // 创建菜单有两种使用方式，一种是 使用inflate 来加载XML，如以下注释中
    // 第二种是使用 add()方法的方式来操作。
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        // getMenuInflater().inflate(R.menu.main, menu); 第一种使用方式
        // 设置菜单选项一般最好设置低于 6个选项
        MenuItem menuItem = menu.add(1001, 100, 1, "菜单一");
        // menuItem.setIcon(R.drawable.ic_launcher); //高版本中不建议添加图标。添加了图标也不会显示的。
        MenuItem menuItem2 = menu.add(1001, 101, 2, "菜单二");
        MenuItem menuItem3 = menu.add(1001, 102, 3, "菜单三");
        menuItem3.setShortcut('c', 'c'); // 设置菜单快捷键
        return true;
    }

    // 触发菜单的点击事件
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case 100:
                Toast.makeText(MainActivity.this, "点击菜单一选项", 3).show();
                break;
            case 101:
                // 菜单选项一般都用户跳转到其他Activity的操作，使用
                // setIntent()方法，当然也可以通过Intent来传递一些信息。
                Intent intent = new Intent(MainActivity.this, NextActivity.class);
                item.setIntent(intent);
                break;
            case 102:
                break;
            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    public void clickHandler(View source){
        //获取UI 界面中ID为R.id.show 的文本框
        TextView tv = (TextView) findViewById(R.id.show);
        tv.setText("Hello Android-"+ new java.util.Date());
    }
}
