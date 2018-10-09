package com.class16t1.dominhthuy.adapter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ArrayList <String> list;
    android.widget.ListView LW;
    android.widget.GridView GW;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview);
        init();
        ArrayAdapter adapter = new ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item,list);
        LW = findViewById(R.id.listview);
        LW.setAdapter(adapter);
    }

    public void init (){
        list = new ArrayList<String>();
        list.add("Thuy");
        list.add("Thanh");
        list.add("Dung");
        list.add("doi");
        list.add("bung");
        list.add("qua");
        list.add("ahihi");
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("7");
        list.add("8");
        list.add("9");
        list.add("10");
    }

    public void Chuyen_sang_grid(View view) {
        setContentView(R.layout.gridview);
        ArrayAdapter adapter = new ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item,list);
        GW = findViewById(R.id.gridview);
        GW.setAdapter(adapter);

    }
    public void Chuyen_sang_list(View view) {
        setContentView(R.layout.listview);
        ArrayAdapter adapter = new ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item,list);
        LW = findViewById(R.id.listview);
        LW.setAdapter(adapter);
    }
}
