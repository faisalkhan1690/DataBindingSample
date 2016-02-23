package com.example.faisal.databindingsample;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.faisal.databindingsample.Model.User;
import com.example.faisal.databindingsample.databinding.ActivitySimpleTextViewBinding;

/**
 * <h1><font color="green">SimpleTextViewActivity</font></h1>
 *
 * <p>In this activity we are using Data binding library and setting text Faisal Khan in the text TextView Lets See how</p>
 * <p>First Data Binding library Will generate a Class file as per this activity layout name ActivitySimpleTextViewBinding.class
 * by using that class we will access this data over xml. For xml code please check activity_simple_text_view layout</p>
 */
public class SimpleTextViewActivity extends AppCompatActivity {

    private ActivitySimpleTextViewBinding activitySimpleTextViewBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_text_view);

        activitySimpleTextViewBinding= DataBindingUtil.setContentView(this,R.layout.activity_simple_text_view);
        activitySimpleTextViewBinding.setUserdata(new User("Faisal","Khan"));
    }

}
