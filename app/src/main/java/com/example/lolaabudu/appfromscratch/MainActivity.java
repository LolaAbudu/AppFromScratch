package com.example.lolaabudu.appfromscratch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.LinearLayout;

import com.example.lolaabudu.appfromscratch.controller.AndoidAdapter;
import com.example.lolaabudu.appfromscratch.model.AndroidList;
import com.example.lolaabudu.appfromscratch.model.MyAndroid;
import com.example.lolaabudu.appfromscratch.network.AndroidService;
import com.example.lolaabudu.appfromscratch.network.AndroidSingleton;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "all_android_types";
    RecyclerView recyclerView;
    List<MyAndroid> myAndroidList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.android_recyclerView);

        Retrofit retrofit = AndroidSingleton.getSingleInstance();
        AndroidService androidService = retrofit.create(AndroidService.class);

        Call<AndroidList> androidType = androidService.getAndroid();
        androidType.enqueue(new Callback<AndroidList>() {
            @Override
            public void onResponse(Call<AndroidList> call, Response<AndroidList> response) {
                Log.d(TAG, "onResponse: " + response.body().getAndroidList().get(0).getName());
                for(MyAndroid myAndroid : response.body().getAndroidList()){
                    myAndroidList.add(myAndroid);
                    Log.d("test", "onResponse" + myAndroidList.size());
                }
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL,false);
                AndoidAdapter andoidAdapter = new AndoidAdapter(myAndroidList);
                recyclerView.setAdapter(andoidAdapter);
                recyclerView.setLayoutManager(linearLayoutManager);
            }

            @Override
            public void onFailure(Call<AndroidList> call, Throwable t) {
                Log.d(TAG, "onFailure: " +t.toString());
            }
        });



    }
}


//this is the JSON being used
//{ "android": [ { "ver": "1.5", "name": "Cupcake", "api": "API level 3" }, { "ver": "1.6", "name": "Donut", "api": "API level 4" }, { "ver": "2.0 - 2.1", "name": "Eclair", "api": "API level 5 - 7" }, { "ver": "2.2", "name": "Froyo", "api": "API level 8" }, { "ver": "2.3", "name": "Gingerbread", "api": "API level 9 - 10" }, { "ver": "3.0 - 3.2", "name": "Honeycomb", "api": "API level 11 - 13" }, { "ver": "4.0", "name": "Ice Cream Sandwich", "api": "API level 14 - 15" }, { "ver": "4.1 - 4.3", "name": "JellyBean", "api": "API level 16 - 18" }, { "ver": "4.4", "name": "KitKat", "api": "API level 19" }, { "ver": "5.0 - 5.1", "name": "Lollipop", "api": "API level 21 - 22" }, { "ver": "6.0", "name": "Marshmallow", "api": "API level 23" }, { "ver": "7.0 - 7.1", "name": "Nougat", "api": "API level 24 - 25" } ] }