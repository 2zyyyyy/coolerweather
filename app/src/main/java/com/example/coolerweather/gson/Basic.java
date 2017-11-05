package com.example.coolerweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 月满轩尼诗丶 on 2017/11/2.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public  Update update;

    public class Update {

        @SerializedName("loc")
        public String updateTime;

    }
}
