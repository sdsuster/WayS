package com.startdown.ways.views;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.startdown.ways.R;
import com.startdown.ways.contracts.sample.SampleContract;
import com.startdown.ways.models.people.People;
import com.startdown.ways.presenters.SamplePresenter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements SampleContract.View {

    @BindView(R.id.name)
    TextView name;

    SampleContract.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
        new SamplePresenter(this);
    }

    @Override
    protected void onResume() {
        super.onResume();

        if(presenter != null){
            presenter.loadData();
        }

    }

    @Override
    public void onReady(People people) {
        name.setText(people.getName());
    }

    @Override
    public void setPresenter(SampleContract.Presenter presenter) {
        this.presenter = presenter;
    }
}
