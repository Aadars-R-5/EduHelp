package com.example.test14;

import com.google.firebase.database.Exclude;

public class Upload {
    private String mName;
    private String mImageUrl;
    private String mUserName;
    private String mDescription;
    private String mRating;
    private String mKey;

    public Upload() {
        //empty constructor needed
    }

    public Upload(String name, String imageUrl, String username, String description, String rating) {
        if (name.trim().equals("")) {
            name = "No Name";
        }

        mName = name;
        mImageUrl = imageUrl;
        mUserName = username;
        mDescription = description;
        mRating = rating;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getImageUrl() {
        return mImageUrl;
    }

    public void setImageUrl(String imageUrl) {
        mImageUrl = imageUrl;
    }

    public String getUserName() { return mUserName;}

    public void setUserName(String username) {
        mUserName = username;
    }

    public String getDescription() { return mDescription;}

    public void setDescription(String description) {
        mDescription = description;
    }

    public String getRating() { return mRating;}

    public void setRating(String rating) {mRating = rating;}



    @Exclude
    public String getKey() {
        return mKey;
    }

    @Exclude
    public void setKey(String key) {
        mKey = key;
    }

}
