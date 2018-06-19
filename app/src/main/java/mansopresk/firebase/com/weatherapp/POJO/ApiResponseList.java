package mansopresk.firebase.com.weatherapp.POJO;

import java.util.List;

/**
 * Created by vignus on 10/14/2017.
 */

public class ApiResponseList {


    public String dt_txt;
    public List<Weather> weather;
    public Wind wind;
    public MainData main;

    public Wind getWind() {
        return wind;
    }


    public MainData main() {
        return main;
    }


    public List<Weather> getWeather() {
        return weather;
    }

    public String getDt_txt() {
        return dt_txt;
    }
}