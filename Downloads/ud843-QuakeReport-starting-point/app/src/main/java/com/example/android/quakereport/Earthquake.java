package com.example.android.quakereport;

public class Earthquake {
    private double cMagnitude;
    private String cLocation;
    private long cDate;
    private String Url;

   public Earthquake(double cMagnitude,String cLocation,long cDate,String Url)
    {
        this.cMagnitude=cMagnitude;
        this.cLocation=cLocation;
        this.cDate=cDate;
        this.Url=Url;

    }


    public double getcMagnitude() {
        return cMagnitude;
    }
    public String getcLocation()
    {
        return cLocation;
    }
    public long getcDate()
    {
        return cDate;
    }
    public String getUrl()
    {
        return Url;
    }

}
