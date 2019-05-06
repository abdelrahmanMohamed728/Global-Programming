package com.example.abdo.globalprogramming;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FinishAcitivity extends AppCompatActivity {
    ListView listView;
    ArrayList<Item>list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish_acitivity);
        listView = findViewById(R.id.list3);
        list = (ArrayList<Item>)getIntent().getSerializableExtra("myList");
        FirstTaskAdapter firstTaskAdapter = new FirstTaskAdapter(FinishAcitivity.this,list);
        listView.setAdapter(firstTaskAdapter);
    }
}
