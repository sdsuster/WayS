package com.startdown.ways.api.sample;

import com.startdown.ways.api.base.BaseAPI;


public class SampleServiceProvider {
    private static SampleService instance = BaseAPI.getRetrofit().create(SampleService.class);
    private SampleServiceProvider(){}
    public static SampleService getService(){
        return instance;
    }
}
