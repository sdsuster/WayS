package com.startdown.ways.contracts.sample;

import com.startdown.ways.contracts.base.BasePresenter;
import com.startdown.ways.contracts.base.BaseView;
import com.startdown.ways.models.people.People;

public class SampleContract {
    public interface View extends BaseView<Presenter> {
        void onReady(People people);
    }
    public interface Presenter extends BasePresenter {
        void loadData();
    }
}
