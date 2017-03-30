package com.example.android.quakereport;

/**
 * Created by alwaris on 3/7/17.
 */

public class Earthquake {


    // Magnitude of earthquake
    private double mMag;

    // Where earthquake occured
    private String mPlace;

    // When earthquake occured
    private Long mTime;

    /** Website URL of the earthquake */
    private String mUrl;

    /*
    * Create a new Earthquake object.
    *
    * @param mag is a measure of the size of an earthquake.
    * @param place is the geographic region near to the event.
    * @param time is  when the event occurred.
    * @param url is the website URL to find more details about the earthquake
    * */

    public Earthquake(double mag, String place, Long time, String url)
    {
        mMag = mag;
        mPlace = place;
        mTime = time;
        mUrl = url;
    }

    /**
     * Get magnitude
     */
    public double getMag() {
        return mMag;
    }

    /**
     * Get place
     */
    public String getPlace() {
        return mPlace;
    }

    /**
     * Get time
     */
    public Long getTime() {
        return mTime;
    }

    /**
     * Get url
     */
    public String getUrl() {
        return mUrl;
    }
}
