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

/**
 * <h2>FOR COMPLETE DETAILS CHECK : http://developer.android.com/tools/data-binding/guide.html</h2>
 * <h3>By using data binding we remove the findViewById calls and data is set dynamically without </h3>
 * <p>To get started with Data Binding, download the library from the Support repository in the Android SDK manager. <br>
 *  To configure your app to use data binding, add the dataBinding element to your build.gradle file in the app module. <br>
 *  Add following in build.gradle project file <br>
 *  <h4>classpath 'com.android.tools.build:gradle:1.3.1'<br>
 *
 // TODO: when the final verison of dataBinder is release, change this to use a version number.<br>

 *  classpath 'com.android.databinding:dataBinder:1.+'</h4>
 *  Add following in build.gradle app file <br>
 *  <h4>apply plugin: 'com.android.databinding'</h4></p>
 *  <p>Check the layout - activity_simple_text_view.xml
 *  <h4>By default, a Binding class will be generated based on the name of the layout file, converting it to Pascal case
 *  and suffixing “Binding” to it. The above layout file was activity_simple_text_view.xml so the generate class was ActivitySimpleTextViewBinding.</h4></p>---Faisal
 */
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
