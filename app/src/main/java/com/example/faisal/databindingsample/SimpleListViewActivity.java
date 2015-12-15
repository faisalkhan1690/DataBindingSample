package com.example.faisal.databindingsample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.example.faisal.databindingsample.Model.User;

import java.util.ArrayList;

public class SimpleListViewActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    private ArrayList<User> listData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_list_view);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        recyclerView=(RecyclerView)findViewById(R.id.rv_data);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        listData=new ArrayList<User>();

        listData.add(new User("Faisal","Khan"));
        listData.add(new User("Ranjeet","Singh"));
        listData.add(new User("Deepak","Sharma"));
        listData.add(new User("Hisham","Muneer"));
        listData.add(new User("Sandeep","Patel"));

        recyclerView.setAdapter(new MyRecylerViewAdapter(SimpleListViewActivity.this,listData));








    }

}
