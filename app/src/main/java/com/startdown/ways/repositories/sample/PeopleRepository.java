package com.startdown.ways.repositories.sample;


import retrofit2.Call;


public class PeopleRepository implements PeopleDataSource {
    private static PeopleRepository instance;

    private PeopleRemoteDataSource peopleRemoteDataSource = new PeopleRemoteDataSource();

    private PeopleRepository(){

    }

    @Override
    public Call getPeople(int id) {
        return peopleRemoteDataSource.getPeople(id);
    }
    public static PeopleRepository getInstance(){
        if(instance == null){
            instance = new PeopleRepository();
        }
        return  instance;

    }
}
