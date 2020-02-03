package com.startdown.ways.api.sample;

import com.startdown.ways.models.people.People;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface SampleService {
    @GET("people/{id}")
    Call<People> getById(@Path("id") Integer id);
}
