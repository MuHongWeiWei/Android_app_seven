package com.example.android_app_seven;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListActivity extends AppCompatActivity {

    String[] drinks = {"紅茶","綠茶","青茶","烏龍茶","普洱茶"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ListView listView = findViewById(R.id.lv);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_expandable_list_item_1,drinks);


        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ListActivity.this,drinks[position],Toast.LENGTH_SHORT).show();
            }
        });




    }
}
