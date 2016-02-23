package com.example.faisal.databindingsample;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.faisal.databindingsample.Model.User;
import com.example.faisal.databindingsample.databinding.ListItemBinding;

import java.util.ArrayList;

/**
 * <h1><font color="green">SimpleTextViewActivity</font></h1>
 *
 * <p>In this activity we are using Data binding library and setting text Faisal Khan in the text TextView Lets See how</p>
 * <p>First Data Binding library Will generate a Class file as per this layout name on which we are using ListItemBinding.class
 * by using that class we will access this data over xml. For xml code please check list_item layout</p>--- Faisal
 */

public class MyRecylerViewAdapter extends RecyclerView.Adapter<MyRecylerViewAdapter.MyViewHolder> {

    private final Context context;
    private final ArrayList<User> listData;


    MyRecylerViewAdapter(Context context,ArrayList<User> listData){
        this.context=context;
        this.listData=listData;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        //setting position in binding object
        holder.getBinding().setPosition(position);
    }

    @Override
    public int getItemCount() {
        if(listData==null)
            return 0;
        return listData.size();
    }

    class  MyViewHolder extends RecyclerView.ViewHolder{

        ListItemBinding listItemBinding;

        public MyViewHolder(View itemView) {
            super(itemView);

            //creating reference of databinding class
            listItemBinding = DataBindingUtil.bind(itemView);

            //setting the list in initial because i will never change but you set data any where you want
            listItemBinding.setUserList(listData);
        }
        public ListItemBinding getBinding() {
            return listItemBinding;
        }
    }
}

