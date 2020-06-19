package com.example.quakereport;




/**
 * An{@link EarthquakeActivity}object creating information about an object.
 */


public class Earthquake {

    /**
     * Magnitude of the earthquake
     */
    private String mMagnitude;

    /**
     * location of the earthquake
     */
    private String mLocatoin;

    /**
     * Date of the earthquake
     */
    private String mDate;

    /**
     * Construc a new {@link EarthquakeActivity} object.
     *
     * @param magnitude is the magnitude(size) of the earthquake.
     * @param location id the location of the earthquake.
     * @param date is the date and time when the earthqauke happened.
     */

    public Earthquake(String magnitude, String location , String date){
        magnitude = magnitude;
        mLocatoin = location;
        mDate = date;
    }


    /**
     * @return the magnitude of the earthquake.
     */
    public String getMagnitude(){
        return mMagnitude;
    }

    /**
     * @return the location of the earthquake.
     */
    public String getLocation(){
        return mLocatoin;
    }

    /**
     * @return the date of the earthquake.
     */
    public String getDate(){
        return mDate;
    }

}
