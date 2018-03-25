package com.example.android.quakereport;

public class Earthquake {
    private double mMagValue;
    private String mPlaceValue;
    private long mDateValue;
    private String mURL;

    public Earthquake(double vMagValue, String vCityValue, long vDateValue, String vURL){
        mMagValue = vMagValue;
        mPlaceValue = vCityValue;
        mDateValue = vDateValue;
        mURL = vURL;
    }

    public double getmMagValue() {
        return mMagValue;
    }

    public String getmPlaceValue() {return mPlaceValue;}

    public long getmDateValue() {return mDateValue;}

    public String getmURL() {return mURL;}

}