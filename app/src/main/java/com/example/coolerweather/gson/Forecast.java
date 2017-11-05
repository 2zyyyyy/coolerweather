package com.example.coolerweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 月满轩尼诗丶 on 2017/11/2.
 */

public class Forecast {

    public String date;

    @SerializedName("tmp")
    public Temperature temperaturel;

    @SerializedName("cond")

    public More more;

    public class Temperature {

        public String max;

        public String min;

    }

    public class More {

        @SerializedName("text_d")
        public String info;

    }
}
