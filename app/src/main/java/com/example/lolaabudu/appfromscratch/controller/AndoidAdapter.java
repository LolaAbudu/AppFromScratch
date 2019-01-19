package com.example.lolaabudu.appfromscratch.controller;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lolaabudu.appfromscratch.R;
import com.example.lolaabudu.appfromscratch.model.AndroidList;
import com.example.lolaabudu.appfromscratch.model.MyAndroid;
import com.example.lolaabudu.appfromscratch.view.AndroidViewHolder;

import java.util.List;

public class AndoidAdapter extends RecyclerView.Adapter<AndroidViewHolder> {
    private List<MyAndroid>myAndroidList;

    public AndoidAdapter(List<MyAndroid> myAndroidList) {
        this.myAndroidList = myAndroidList;
    }

    @NonNull
    @Override
    public AndroidViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View childView = LayoutInflater.from(parent.getContext()).inflate(R.layout.android_itemview, parent, false);
        return new AndroidViewHolder(childView);
    }

    @Override
    public void onBindViewHolder(@NonNull AndroidViewHolder androidViewHolder, int position) {
        androidViewHolder.onBind(myAndroidList.get(position));
    }

    @Override
    public int getItemCount() {
        return myAndroidList.size();
    }
}
