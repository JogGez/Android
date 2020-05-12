package com.androdocs.weatherapp.util;

import android.content.Context;
import android.graphics.drawable.Drawable;

import com.androdocs.weatherapp.R;

public class WeatherImageHelper {

    public int getWeatherImage(String weatherDescription){
        int weatherImage;
        switch (weatherDescription.toLowerCase()) {
            case "thunderstorm":
                weatherImage = R.drawable.ic_thunderstorm;
                break;
            case "drizzle":
                weatherImage = R.drawable.ic_drizzle;
                break;
            case "rain":
                weatherImage = R.drawable.ic_rain;
                break;
            case "snow":
                weatherImage = R.drawable.ic_snow;
                break;
            case "atmosphere":
                weatherImage = R.drawable.ic_atmosphere;
                break;
            case "clear":
                weatherImage = R.drawable.ic_clear;
                break;
            case "clouds":
                weatherImage = R.drawable.ic_cloudy;
                break;
            case "extreme":
                weatherImage = R.drawable.ic_extreme;
                break;
            default:
                weatherImage = R.drawable.ic_launcher;
        }
        return weatherImage;
    }


}
