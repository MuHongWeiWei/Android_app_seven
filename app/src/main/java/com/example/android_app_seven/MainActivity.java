package com.example.android_app_seven;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void click1(View view) {
        new AlertDialog.Builder(this)
                .setTitle("範例程式")
                .setMessage("要到下一題嗎?")
                .setIcon(android.R.drawable.btn_star)
                .setPositiveButton("確定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        startActivity(new Intent(MainActivity.this,ListActivity.class));
                    }
                })
                .setNegativeButton("取消",null)
                .setCancelable(false)
                .show();
    }


}
