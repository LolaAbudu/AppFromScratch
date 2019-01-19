package com.example.lolaabudu.appfromscratch.network;

import com.example.lolaabudu.appfromscratch.model.AndroidList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface AndroidService {
    @GET("android/jsonandroid/")
    Call<AndroidList> getAndroid();
}

//1) need a @GET
//2) need a instance of the outer Object class (parent)