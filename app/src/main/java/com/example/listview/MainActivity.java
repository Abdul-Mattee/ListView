package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = findViewById(R.id.listContainer);
        ArrayList<String> arrayList = new ArrayList<String>();

        arrayList.add("abdullah");
        arrayList.add("mattee");
        arrayList.add("ahmad");
        arrayList.add("umer");
        arrayList.add("wahab");
        arrayList.add("dani");
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(arrayAdapter);
    }
}