package com.ifeng_tech.treasuryyitong.myapplication6;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv=(TextView)findViewById(R.id.tv);
      //  String str=null;
        String str="老表真帅";
        tv.setText(str);
    }
}
