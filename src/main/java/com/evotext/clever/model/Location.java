package com.evotext.clever.model;

/**
 * 
 * @author brendanclemenzi
 *
 */
public class Location
{
    private String zip;
    private String address;
    private String state;
    private String city;
    private String lat;
    private String lon;

    public String getZip()
    {
        return zip;
    }
    public void setZip(String zip)
    {
        this.zip = zip;
    }

    public String getAddress()
    {
        return address;
    }
    public void setAddress(String address)
    {
        this.address = address;
    }

    public String getState()
    {
        return state;
    }
    public void setState(String state)
    {
        this.state = state;
    }

    public String getCity()
    {
        return city;
    }
    public void setCity(String city)
    {
        this.city = city;
    }
    
    public String getLat()
    {
        return lat;
    }
    public void setLat(String lat)
    {
        this.lat = lat;
    }
    
    public String getLon()
    {
        return lon;
    }
    public void setLon(String lon)
    {
        this.lon = lon;
    }
}
