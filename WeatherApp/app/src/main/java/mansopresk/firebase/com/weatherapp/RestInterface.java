package mansopresk.firebase.com.weatherapp;

import mansopresk.firebase.com.weatherapp.POJO.Main;
import mansopresk.firebase.com.weatherapp.POJO.Model;
import retrofit.Callback;
import retrofit.http.GET;

/**
 * Created by Shaik on 05-10-2017.
 */

public interface RestInterface
{
    @GET("/forecast?q=München,DE")


    void getWhetherReport(Callback<Main> callback);
}
