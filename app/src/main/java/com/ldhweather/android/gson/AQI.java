package com.ldhweather.android.gson;

/**
 * Created by LDH on 2020/2/27.
 */

public class AQI {
    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
