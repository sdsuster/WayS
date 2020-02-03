package com.startdown.ways.api.base;

import com.startdown.ways.utils.Configuration;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class BaseAPI {
    private static Retrofit instance = new Retrofit.Builder()
            .baseUrl(Configuration.BaseAPI)
            .addConverterFactory(GsonConverterFactory.create())
            .build();
    private BaseAPI(){
    }
    public static  Retrofit getRetrofit(){
        return instance;
    }
}
