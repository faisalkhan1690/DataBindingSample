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
 * Created by faisal khan on 12/13/2015.
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
            listItemBinding = DataBindingUtil.bind(itemView);
            listItemBinding.setUserList(listData);
        }
        public ListItemBinding getBinding() {
            return listItemBinding;
        }
    }
}

