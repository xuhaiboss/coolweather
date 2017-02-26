package android.coolweather.com.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by admin on 2017-02-23.
 */

public class Forecast {

    public String date;

    @SerializedName("tmp")
    public Temparature temparature;

    @SerializedName("cond")
    public More more;

    public class Temparature{

        public String max;
        public String min;
    }

    public class More{

        @SerializedName("txt_d")
        public String info;
    }
}
