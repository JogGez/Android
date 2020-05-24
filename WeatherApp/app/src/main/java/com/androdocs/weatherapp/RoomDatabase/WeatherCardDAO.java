package com.androdocs.weatherapp.RoomDatabase;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface WeatherCardDAO {

    @Query("SELECT * FROM weathercardentity")
    List<WeatherCardEntity> getAllWeatherCardEntities();

}
