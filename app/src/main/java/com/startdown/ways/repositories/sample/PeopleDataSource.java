package com.startdown.ways.repositories.sample;

import com.startdown.ways.models.people.People;

import retrofit2.Call;

public interface PeopleDataSource {
    Call getPeople(int id);

}
