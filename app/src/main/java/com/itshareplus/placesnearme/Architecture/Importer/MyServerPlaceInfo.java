package com.itshareplus.placesnearme.Architecture.Importer;

/**
 * Created by Mai Thanh Hiep on 6/19/2016.
 */
public class MyServerPlaceInfo {
    public String googlePlaceId;
    public int placeId;
    public String name;
    public String address;
    public double lat, lng;
    public String website;
    public String phoneNumber;
    public String internationalPhoneNumber;
    public String create;
    public String modified;


    public MyServerPlaceInfo(String googlePlaceId, int placeId, String name, String address, double lat, double lng, String website, String phoneNumber, String internationalPhoneNumber, String createTime, String modifiedTime) {
        this.googlePlaceId = googlePlaceId;
        this.placeId = placeId;
        this.name = name;
        this.address = address;
        this.lat = lat;
        this.lng = lng;
        this.website = website;
        this.phoneNumber = phoneNumber;
        this.internationalPhoneNumber = internationalPhoneNumber;
        create = createTime;
        modified = modifiedTime;

    }
}
