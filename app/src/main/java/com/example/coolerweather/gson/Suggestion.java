package com.example.coolerweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 月满轩尼诗丶 on 2017/11/2.
 */

public class Suggestion {

    @SerializedName("comf")
    public Comfor comfor;

    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport;

    public class Comfor {

        @SerializedName("txt")
        public String info;

    }

    public class CarWash {

        @SerializedName("txt")
        public String info;

    }

    public class Sport {

        @SerializedName("txt")
        public String info;

    }
}
