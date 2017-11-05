package com.example.coolerweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by 月满轩尼诗丶 on 2017/11/2.
 */

public class Weather {

    public String status;

    public Basic basic;

    public  AQI aqi;

    public Now now;

    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;

}
