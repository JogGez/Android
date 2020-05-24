package com.androdocs.weatherapp.RoomDatabase;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class WeatherCardEntity {

    public WeatherCardEntity(String appid, String city, String units, int days) {
        this.APPID = appid;
        this.city = city;
        this.units = units;
        this.days = days;
    }

    @PrimaryKey(autoGenerate = false) @NonNull
    private String APPID;

    @ColumnInfo(name = "city")
    private String city;

    @ColumnInfo(name = "units")
    private String units;

    @ColumnInfo(name = "days")
    private int days;



    public String getAPPID() {
        return APPID;
    }

    public void setAPPID(String APPID) {
        this.APPID = APPID;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }
}
