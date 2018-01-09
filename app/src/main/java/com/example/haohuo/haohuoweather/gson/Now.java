package com.example.haohuo.haohuoweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by HaoHuo on 2018/1/9.
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
