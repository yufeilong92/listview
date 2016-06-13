package com.example.listview;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Administrator on 2016/6/13.
 */
public class IndexActivity extends Activity {
    private Button btnMainActivity,btnlistactivity ,btnlistview;
    private ButtonListener listener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.indexactivity);
        /**
         * 监听对象一定要创建否则没用
         */
        listener = new ButtonListener();
/**
 * 控件
 */
        FindView();
/**
 * 设置监听
 */
        OnSetClickListener();
    }

    private void OnSetClickListener() {
        btnMainActivity.setOnClickListener(listener);
        btnlistactivity.setOnClickListener(listener);
        btnlistview.setOnClickListener(listener);
    }

    private void FindView() {
        btnlistview= (Button) findViewById(R.id.btnlistview);
        btnlistactivity= (Button) findViewById(R.id.btnlist);
        btnMainActivity = (Button) findViewById(R.id.btnmain);
    }

    private class ButtonListener implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btnmain:
                    Intent intent = new Intent(IndexActivity.this, MainActivity.class);
                    startActivity(intent);
                    break;
                case R.id.btnlist:
                    Intent intent1 = new Intent(IndexActivity.this, ListViewActivity.class);
                    startActivity(intent1);
                    break;

                case R.id.btnlistview:
                    Intent intent2 = new Intent(IndexActivity.this, ListActivity.class);
                    startActivity(intent2);
                    break;


            }
        }
    }
}
