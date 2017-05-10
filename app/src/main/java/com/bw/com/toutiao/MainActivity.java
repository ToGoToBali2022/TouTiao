package com.bw.com.toutiao;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;

public class MainActivity extends Activity {
    private ListView listView;
    private DrawerLayout layout;
    private ImageButton ibt;
    private ImageView ivsousuo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout = (DrawerLayout) findViewById(R.id.dl);


        ibt = (ImageButton) findViewById(R.id.ivtouxiang);
        //给listview设置适配器
        ivsousuo = (ImageView) findViewById(R.id.ivsousuo);
        //给listview设置适配器

        ibt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layout.openDrawer(Gravity.LEFT);
            }
        });

        ivsousuo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layout.openDrawer(Gravity.RIGHT);
            }
        });
    }
}
