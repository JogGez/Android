package com.androdocs.weatherapp.API;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class WeatherAPI {

    private static final String BASE_URL = "http://api.openweathermap.org/data/2.5/";
    private static final String API_IDENTIFIER = "300e9251ab98a3f16bd8091afbaeb5eb";

    private static Retrofit retrofit = null;

    public static Retrofit retrofitAPI(){
        if (retrofit == null){
            retrofit = new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create())
                    .build();
        }

        return retrofit;
    }

    public static String getApiIdentifier() {
        return API_IDENTIFIER;
    }
}
