package com.androdocs.weatherapp.ViewHolders;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import com.androdocs.weatherapp.Interface.ItemClicked;
import com.androdocs.weatherapp.util.WeatherImageHelper;

public class WeatherCardViewHolder extends RecyclerView.ViewHolder {

    private TextView city;
    private TextView weatherDescription;
    private TextView currentTemp;
    private TextView maxTemp;
    private TextView minTemp;
    private ImageView weatherImage;
    private ItemClicked activity;


    public WeatherCardViewHolder(@NonNull final View itemView, TextView city, TextView weatherDescription, TextView currentTemp, TextView maxTemp, TextView minTemp, ImageView weatherImage, Context context) {
        super(itemView);
        this.activity = (ItemClicked) context;
        this.city = city;
        this.weatherDescription = weatherDescription;
        this.currentTemp = currentTemp;
        this.maxTemp = maxTemp;
        this.minTemp = minTemp;
        this.weatherImage = weatherImage;

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity.onItemClicked(itemView.getTag().toString());
            }
        });
    }

    public void setCity(String city) {
        this.city.setText(city);
    }

    public void setWeatherDescription(String weatherDescription) {
        this.weatherDescription.setText(weatherDescription);
    }

    public void setCurrentTemp(String currentTemp) {
        this.currentTemp.setText(currentTemp);
    }

    public void setMaxTemp(String maxTemp) {
        this.maxTemp.setText(maxTemp);
    }

    public void setMinTemp(String minTemp) {
        this.minTemp.setText(minTemp);
    }

    public void setWeatherImage(Drawable weatherImage) {
        this.weatherImage.setImageDrawable(weatherImage);
    }
}