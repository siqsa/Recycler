package com.example.administrator.recycler;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView=(TextView)findViewById(R.id.textView);
        textView.setText("This is  Diary Project");

        TextView textView2 = (TextView) findViewById(R.id.textView2);
        textView.setText("This is second TextView");



    }
}
