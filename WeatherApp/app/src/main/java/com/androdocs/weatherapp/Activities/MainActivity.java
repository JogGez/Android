package com.androdocs.weatherapp.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import com.androdocs.weatherapp.Activities.AddCityActivity;
import com.androdocs.weatherapp.Fragments.CityWeatherFragment;
import com.androdocs.weatherapp.Interface.ItemClicked;
import com.androdocs.weatherapp.R;

public class MainActivity extends AppCompatActivity implements ItemClicked {

    ImageView addCity;

    public MainActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addCity = findViewById(R.id.addCity);
        addCity.setImageDrawable(getResources().getDrawable(R.drawable.ic_location_city_24dp));
        addCity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                redirectToNextActivity();
            }
        });



    }

    private void redirectToNextActivity(){
            Intent intent = new Intent(this, AddCityActivity.class);
            startActivity(intent);

    }

    @Override
    public void onItemClicked(String index) {
        CityWeatherFragment cityWeatherFragment = (CityWeatherFragment) getSupportFragmentManager().findFragmentById(R.id.cityFragment);
        if (cityWeatherFragment != null) {
            cityWeatherFragment.updateCityView(index);

        } else {
            CityWeatherFragment newFragment = new CityWeatherFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.fragment_container, newFragment);
            transaction.addToBackStack(null);
            transaction.commit();

        }


    }
}