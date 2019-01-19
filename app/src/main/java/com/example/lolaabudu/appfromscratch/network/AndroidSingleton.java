package com.example.lolaabudu.appfromscratch.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class AndroidSingleton {

    private static Retrofit singleInstance;

    private AndroidSingleton() {
    }

    public static Retrofit getSingleInstance() {
        if (singleInstance != null) {
            return singleInstance;
        }
        singleInstance = new Retrofit.Builder()
                .baseUrl("https://api.learn2crack.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return singleInstance;
    }
}
