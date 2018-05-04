package com.example.mrj.testdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //第二次的修改
        setContentView(R.layout.activity_main);
        //第三次的修改
        TestView TestView = new TextView(this);
        TestView TestView1 = new TextView(this);
		TestView TestView2 = new TextView(this);
    }
}
