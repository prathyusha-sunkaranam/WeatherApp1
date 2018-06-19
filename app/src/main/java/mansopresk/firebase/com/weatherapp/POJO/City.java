package mansopresk.firebase.com.weatherapp.POJO;
import com.google.gson.annotations.SerializedName;
/**
 * Created by Mansopresk20 on 10/15/2017.
 */

public class City {
    @SerializedName("id")
    public   int id;

    @SerializedName("name")
    public String name;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
