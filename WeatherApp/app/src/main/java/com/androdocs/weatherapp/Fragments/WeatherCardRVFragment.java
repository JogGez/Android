package com.androdocs.weatherapp.Fragments;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.androdocs.weatherapp.Adapters.WeatherCardAdapter;
import com.androdocs.weatherapp.Data;
import com.androdocs.weatherapp.R;

public class WeatherCardRVFragment extends Fragment {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter weatherCardAdapter;
    private RecyclerView.LayoutManager layoutManager;
    private View view;

    public WeatherCardRVFragment() {
        // Required empty public constructor
    }

    @SuppressLint("ResourceType")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        view = inflater.inflate(R.layout.fragment_weather_card_r_v, container, false);

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        recyclerView = view.findViewById(R.id.weatherCardRView);

        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this.getActivity());

        recyclerView.setLayoutManager(layoutManager);

        weatherCardAdapter = new WeatherCardAdapter(getContext(), new Data());
        recyclerView.setAdapter(weatherCardAdapter);

    }
}
