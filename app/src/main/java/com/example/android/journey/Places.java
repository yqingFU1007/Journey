package com.example.android.journey;

/**
 * Created by apple on 2018/3/29.
 */

public class Places {
    private int mImageId;
    private int mPlaceNameRs;
    private int mPlaceIntroId;
    private int mImageIdSmall;

    public Places(int placeNameRs, int imageId, int placeIntroId, int imageIdSmall) {
        mImageId = imageId;
        mPlaceNameRs = placeNameRs;
        mPlaceIntroId = placeIntroId;
        mImageIdSmall = imageIdSmall;
    }

    public int getmPlaceNameRs() {
        return mPlaceNameRs;
    }

    public int getmImageId() {
        return mImageId;
    }

    public int getmPlaceIntroId() {
        return mPlaceIntroId;
    }

    public int getmImageIdSmall() {
        return mImageIdSmall;
    }
}
