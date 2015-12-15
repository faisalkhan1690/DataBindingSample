package com.example.faisal.databindingsample;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.faisal.databindingsample.Model.User;
import com.example.faisal.databindingsample.databinding.ActivitySimpleTextViewBinding;

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
