package com.startdown.ways.presenters;


import com.startdown.ways.contracts.sample.SampleContract;
import com.startdown.ways.models.people.People;
import com.startdown.ways.repositories.sample.PeopleRepository;



import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SamplePresenter implements SampleContract.Presenter {

    private PeopleRepository repository = PeopleRepository.getInstance();


    private SampleContract.View view;

    public SamplePresenter(SampleContract.View view){
        this.view = view;

        view.setPresenter(this);
    }

    @Override
    public void loadData() {
        repository.getPeople(1).enqueue(
                new Callback<People>() {
                    @Override
                    public void onResponse(Call<People> call, Response<People> response) {
                        view.onReady(response.body());
                    }

                    @Override
                    public void onFailure(Call<People> call, Throwable t) {

                    }
                }
        );
    }

    @Override
    public void start() {
        loadData();
    }
}
