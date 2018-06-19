package mansopresk.firebase.com.weatherapp.POJO;

/**
 * Created by Shaik on 05-10-2017.
 */




import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Weather
{


@SerializedName("id")
    public int id;

    @SerializedName("main")
    public String main;

    @SerializedName("description")
    public String description;


    @SerializedName("icon")
    public String icon;

    public void setId(int id)
    {
        this.id = id;
    }
    public int getId()
    {
        return this.id;
    }
    public void setMain(String main)
    {
        this.main = main;
    }
    public String getMain()
    {
        return this.main;
    }
    public void setDescription(String description)
    {
        this.description = description;
    }
    public String getDescription()
    {
        return this.description;
    }
    public void setIcon(String icon)
    {
        this.icon = icon;
    }
    public String getIcon()
    {
        return this.icon;
    }
}
