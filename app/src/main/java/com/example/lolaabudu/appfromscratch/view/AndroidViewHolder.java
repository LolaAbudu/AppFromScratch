package com.example.lolaabudu.appfromscratch.view;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.lolaabudu.appfromscratch.DisplayActivity;
import com.example.lolaabudu.appfromscratch.R;
import com.example.lolaabudu.appfromscratch.model.MyAndroid;


public class AndroidViewHolder extends RecyclerView.ViewHolder {
    private TextView verTextView;
    private TextView nameTextView;
    private TextView apiTextView;
    private MyAndroid myAndroid;
    private Intent intent;

    public static final String VER_KEY = "ver";
    public static final String NAME_KEY = "name";
    public static final String API_KEY = "api";

    public AndroidViewHolder(@NonNull View itemView) {
        super(itemView);
        verTextView = itemView.findViewById(R.id.ver_textView);
        nameTextView = itemView.findViewById(R.id.name_textView);
        apiTextView = itemView.findViewById(R.id.api_textView);
    }

    //set as final so that it does not change
    public void onBind(final MyAndroid myAndroid){
        this.myAndroid=myAndroid;
        verTextView.setText(myAndroid.getVer());
        nameTextView.setText(myAndroid.getName());
        apiTextView.setText(myAndroid.getApi());

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(v.getContext(), DisplayActivity.class);
                intent.putExtra(VER_KEY, myAndroid.getVer());
                intent.putExtra(NAME_KEY, myAndroid.getName());
                intent.putExtra(API_KEY, myAndroid.getApi());
                v.getContext().startActivity(intent);
            }
        });

    }
}
