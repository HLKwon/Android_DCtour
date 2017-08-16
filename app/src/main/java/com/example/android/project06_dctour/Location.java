package com.example.android.project06_dctour;

import static android.provider.ContactsContract.CommonDataKinds.Website.URL;

/**
 * Created by louis on 8/15/17.
 */

public class Location {
    private String mName;
    private String mAddress;
    private String mSummary;
    private int mImageID;
    private String mURL;
    private String mType;

    //Constructor
    public Location(String name, String address, String summary, int imageID, String url, String type){
        mName = name;
        mAddress = address;
        mSummary = summary;
        mImageID = imageID;
        mURL = url;
        mType = type;
    }

    //Getters
    public String getName(){
        return mName;
    }
    public String getAddress(){
        return mAddress;
    }
    public String getSummary(){
        return mSummary;
    }
    public int getImageID(){
        return mImageID;
    }
    public String getURL(){
        return mURL;
    }
    public String getType(){
        return mType;
    }

}
