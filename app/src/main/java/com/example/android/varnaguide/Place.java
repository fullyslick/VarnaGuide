package com.example.android.varnaguide;

/**
 * Created by AR on 25.5.2017 г..
 */

public class Place {

    //The title of the place
    private String mTitle;

    //The address of the place
    private String mAddress;

    //The Id of Image Preview photo of the place
    private int mImageResourceId;

    //The id of the Image Cover in the place_details.xml
    private int mCoverResourceId;

    //The location coordinates that will be used for map intent
    private String mLocationDataURI;

    //Working hours string, that will be displayed in place_details.xml
    private String mWorkingHours;

    //The phone string that will be displayed
    // and used to make phone call intent in place_details.xml
    private String mPhone;

    //The Website of a Place string that will be displayed
    // and used to make browser intent in place_details.xml
    private String mWebUrl;

    //The description of the place that will be displayed in place_details.xml
    private String mDescription;


    //Construct the Place class for all Categories
    public Place(String title, String address, int imageResourceId, int coverResourceId, String locationDataURI,
                 String workingHours, String description){
        mTitle = title;
        mAddress = address;
        mImageResourceId = imageResourceId;
        mCoverResourceId = coverResourceId;
        mLocationDataURI = locationDataURI;
        mWorkingHours = workingHours;
        mDescription = description;
    }

    //Construct the Place class only for Museums, Bars & Restaurants categories
    public Place(String title, String address, int imageResourceId, int coverResourceId, String locationDataURI,
                 String workingHours, String description, String phone, String webUrl){
        mTitle = title;
        mAddress = address;
        mImageResourceId = imageResourceId;
        mCoverResourceId = coverResourceId;
        mLocationDataURI = locationDataURI;
        mWorkingHours = workingHours;
        mDescription = description;
        mPhone = phone;
        mWebUrl = webUrl;
    }

   //Gets the title of the place
    public String getTitle(){ return mTitle;}

    //Gets the address of the place
    public String getAddress(){ return mAddress;}

    //Gets the Image resource id of the place
    public int getImageResourceId(){ return mImageResourceId; }

    //Gets the cover photo of the place
    public int getCoverResourceId(){ return mCoverResourceId; }

    //Gets the location URI of the place
    public String getLocationDataURI(){ return mLocationDataURI;}

    //Gets the working hours of the place
    public String getWorkingHours(){ return mWorkingHours;}

    //Gets the description of the place
    public String getDescription(){ return mDescription;}

    //Gets the phone of the place
    public String getPhone(){ return mPhone;}

    //Gets the website of the place
    public String getWebUrl(){ return mWebUrl;}
}
