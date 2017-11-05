package com.example.coolerweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 月满轩尼诗丶 on 2017/11/2.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {

        @SerializedName("txt")
        public String info;

    }
}
