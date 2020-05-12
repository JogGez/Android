package com.androdocs.weatherapp.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.androdocs.weatherapp.Adapters.AddCityAdapter;
import com.androdocs.weatherapp.Adapters.WeatherCardAdapter;
import com.androdocs.weatherapp.Data;
import com.androdocs.weatherapp.Interface.ItemClicked;
import com.androdocs.weatherapp.R;

public class AddCityActivity extends AppCompatActivity implements ItemClicked {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter addCityAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_city);

        ImageView searchView = findViewById(R.id.citySearchView);
        searchView.setImageDrawable(getResources().getDrawable(R.drawable.ic_search_24dp));

        searchView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO: API City Call
            }
        });


        recyclerView = (RecyclerView) findViewById(R.id.recycleViewAddCity);

        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);

        recyclerView.setLayoutManager(layoutManager);

        addCityAdapter = new AddCityAdapter(this);
        recyclerView.setAdapter(addCityAdapter);

    }

    @Override
    public void onItemClicked(String city) {

    }
}
