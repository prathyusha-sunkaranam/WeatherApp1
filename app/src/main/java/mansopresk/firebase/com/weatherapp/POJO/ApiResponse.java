package mansopresk.firebase.com.weatherapp.POJO;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by vignus on 10/14/2017.
 */

public class ApiResponse {

    public int cod;
    public String message;
    public int cnt;
    public List<ApiResponseList> list;
    public City city;
    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public List<ApiResponseList> getList() {
        return list;
    }
}
