package com.example.android.journey;

/**
 * Created by apple on 2018/3/29.
 */

public class Places {
    private int mImageId;
    private String mPlaceName;
    private int mPlaceIntroId;
    private int mImageIdSmall;
    public Places(String placeName,int imageId,int placeIntroId,int imageIdSmall){
        mImageId = imageId;
        mPlaceName = placeName;
        mPlaceIntroId = placeIntroId;
        mImageIdSmall = imageIdSmall;
    }
    public String getmPlaceName(){
        return mPlaceName;
    }
    public int getmImageId(){
        return mImageId;
    }
    public int getmPlaceIntroId(){return mPlaceIntroId;}
    public int getmImageIdSmall(){return mImageIdSmall;}
}
