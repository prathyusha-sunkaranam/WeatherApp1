package mansopresk.firebase.com.weatherapp.POJO;

/**
 * Created by Shaik on 05-10-2017.
 */


import com.google.gson.annotations.SerializedName;

public class Wind
{
    @SerializedName("speed")
    private double speed;



    @SerializedName("deg")
    private double deg;


    public double getSpeed()
    {
        return speed;
    }

    public void setSpeed(double speed)

    {
        this.speed = speed;
    }

    public double getDeg()

    {
        return deg;
    }

    public void setDeg(double deg)

    {
        this.deg = deg;
    }

}

