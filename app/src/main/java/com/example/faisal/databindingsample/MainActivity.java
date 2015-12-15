package com.example.faisal.databindingsample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private ArrayAdapter<String> arrayAdapter;
    private ArrayList<String> listOfData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=(ListView)findViewById(R.id.listView);

        listOfData=new ArrayList<String>();
        listOfData.add("Data binding with TextView");
        listOfData.add("Data binding with list");

        arrayAdapter=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,listOfData);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch(position){
                    case 0:
                        startActivity(new Intent(MainActivity.this,SimpleTextViewActivity.class));
                        break;
                    case 1:
                        startActivity(new Intent(MainActivity.this,SimpleListViewActivity.class));
                        break;
                    default:
                        Toast.makeText(getApplication(),"Wrong Selection",Toast.LENGTH_LONG).show();
                }
            }
        });


    }
}
