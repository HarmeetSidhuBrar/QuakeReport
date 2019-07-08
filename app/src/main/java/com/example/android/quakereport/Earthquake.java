package com.example.android.quakereport;

public class Earthquake {

private Double eMagnitude;

private String ePlace;

private long mTimeInMilliseconds;

private String eUrl;


public Earthquake (Double magnitude , String place , long timeInMilliseconds , String url){

    eMagnitude=magnitude;
    ePlace=place;
    mTimeInMilliseconds=timeInMilliseconds;
    eUrl=url;
}

    public Double geteMagnitude() {
        return eMagnitude;
    }

    public String getePlace() {
        return ePlace;
    }

    public long getmTimeInMilliseconds(){
        return mTimeInMilliseconds;
    }
    public String geteUrl(){
    return eUrl;
    }
}
