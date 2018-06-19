package mansopresk.firebase.com.weatherapp;

import mansopresk.firebase.com.weatherapp.POJO.ApiResponse;
import mansopresk.firebase.com.weatherapp.POJO.ApiResponseList;
import mansopresk.firebase.com.weatherapp.POJO.MainData;
import retrofit.Callback;
import retrofit.http.GET;

/**
 * Created by Shaik on 05-10-2017.
 */

public interface RestInterface
{
    @GET("/data/2.5/forecast?id=524901&appid=b1b15e88fa797225412429c1c50c122a1")

    void getWhetherReport(Callback<ApiResponse> callback);



}
