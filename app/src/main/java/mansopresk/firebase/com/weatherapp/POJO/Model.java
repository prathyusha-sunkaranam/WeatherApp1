package mansopresk.firebase.com.weatherapp.POJO;

import java.util.*;

/**
 * Created by Shaik on 05-10-2017.
 */


import com.google.gson.annotations.Expose;

public  class Model
{
    @Expose
    private Coord coord;
    @Expose
    private java.util.List<Weather> weather = new ArrayList<Weather>();

    @Expose
    private String base;
    @Expose
    private MainData mainData;

    @Expose
    private Integer visibility;
    @Expose
    private Wind wind;
    @Expose
    private Clouds clouds;
    @Expose
    private Integer dt;
    @Expose
    private Sys sys;
    @Expose
    private Integer id;
    @Expose
    private String name;
    @Expose
    private String cod;

    /**
     *
     * @return
     * The coord
     */
    public Coord getCoord()
    {
        return coord;
    }

    /**
     *
     * @param coord
     * The coord
     */
    public void setCoord(Coord coord)
    {
        this.coord = coord;
    }

    /**
     *
     * @return
     * The weather
     */
    public java.util.List<Weather> getWeather()
    {
        return weather;
    }

    /**
     *
     * @param weather
     * The weather
     */
    public void setWeather(java.util.List<Weather> weather)
    {
        this.weather = weather;
    }

    /**
     *
     * @return
     * The base
     */
    public String getBase()
    {
        return base;
    }

    /**
     *
     * @param base
     * The base
     */
    public void setBase(String base)
    {
        this.base = base;
    }

    /**
     *
     * @return
     * The mainData
     */
    public MainData getMainData()
    {
        return mainData;
    }

    /**
     *
     * @param mainData
     * The mainData
     */
    public void setMainData(MainData mainData)
    {
        this.mainData = mainData;
    }

    /**
     *
     * @return
     * The visibility
     */
    public Integer getVisibility()
    {
        return visibility;
    }

    /**
     *
     * @param visibility
     * The visibility
     */
    public void setVisibility(Integer visibility)
    {
        this.visibility = visibility;
    }

    /**
     *
     * @return
     * The wind
     */
    public Wind getWind()
    {
        return wind;
    }

    /**
     *
     * @param wind
     * The wind
     */
    public void setWind(Wind wind)
    {
        this.wind = wind;
    }


    /**
     *
     * @return
     * The clouds
     */
    public Clouds getClouds()
    {
        return clouds;
    }

    /**
     *
     * @param clouds
     * The clouds
     */
    public void setClouds(Clouds clouds)
    {
        this.clouds = clouds;
    }

    /**
     *
     * @return
     * The dt
     */
    public Integer getDt()
    {
        return dt;
    }

    /**
     *
     * @param dt
     * The dt
     */
    public void setDt(Integer dt)
    {
        this.dt = dt;
    }

    /**
     *
     * @return
     * The sys
     */
    public Sys getSys()
    {
        return sys;
    }

    /**
     *
     * @param sys
     * The sys
     */
    public void setSys(Sys sys) {
        this.sys = sys;
    }

    /**
     *
     * @return
     * The id
     */
    public Integer getId() {
        return id;
    }

    /**
     *
     * @param id
     * The id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     *
     * @return
     * The name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     * The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     * The cod
     */
    public String getCod() {
        return cod;
    }

    /**
     *
     * @param cod
     * The cod
     */
    public void setCod(String cod) {
        this.cod = cod;
    }

}

