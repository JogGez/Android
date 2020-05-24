package com.androdocs.weatherapp.API;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface WeatherApiInterface {

    @GET("forecast")
    Call<ResponseBody> queryWeatherData(
            @Query("q") String city,
            @Query("APPID") String key,
            @Query("units") String units,
            @Query("cnt") int days
            );

}
