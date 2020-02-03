package com.startdown.ways.repositories.sample;

import com.startdown.ways.api.sample.SampleService;
import com.startdown.ways.api.sample.SampleServiceProvider;

import retrofit2.Call;

public class PeopleRemoteDataSource implements PeopleDataSource {
    private SampleService service = SampleServiceProvider.getService();

    @Override
    public Call getPeople(int id) {
        return service.getById(id);
    }

}
