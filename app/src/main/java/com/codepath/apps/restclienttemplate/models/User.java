package com.codepath.apps.restclienttemplate.models;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import org.json.JSONException;
import org.json.JSONObject;
import org.parceler.Parcel;

@Parcel
@Entity
public class User {
    @ColumnInfo
    @PrimaryKey
    public Long id;

    @ColumnInfo
    public String name;
    @ColumnInfo
    public String screenName;
    @ColumnInfo
    public String publicImageUrl;


    public String publicMediaUrl;

    public User(){}     //Required by Parcel


    public static User fromJson(JSONObject jsonObject) throws JSONException {
        User user= new User();
        user.id = jsonObject.getLong("id");
        user.name = jsonObject.getString("name");
        user.screenName = jsonObject.getString("screen_name");
        user.publicImageUrl = jsonObject.getString("profile_image_url_https");
        //user.publicMediaUrl = jsonObject.getString("media_url_https");
        return user;
    }

    public String getName() {
        return name;
    }

    public String getScreenName() {
        return screenName;
    }

    public String getPublicImageUrl() {
        return publicImageUrl;
    }

    public String getPublicMediaUrl(){ return publicMediaUrl;}
}
