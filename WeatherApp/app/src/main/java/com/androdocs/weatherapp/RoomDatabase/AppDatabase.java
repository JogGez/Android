package com.androdocs.weatherapp.RoomDatabase;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {WeatherCardEntity.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract WeatherCardDAO weatherCardDAO();
}
