package com.itshareplus.placesnearme.Architecture.Importer;

import com.google.android.gms.maps.model.LatLng;
import com.itshareplus.placesnearme.Model.MyLocation;

/**
 * Created by Mai Thanh Hiep on 6/19/2016.
 */
public class PlaceInfo {
    public String googlePlaceId;
    public int placeId;
    public String name;
    public String address;
    public double lat, lng;
    public String website;
    public String phoneNumber;
    public String internationalPhoneNumber;
    public String rating;

    public PlaceInfo() {

    }

    public PlaceInfo(String googlePlaceId, int placeId, String name, String address, double lat, double lng, String website, String phoneNumber, String internationalPhoneNumber) {
        this.googlePlaceId = googlePlaceId;
        this.placeId = placeId;
        this.name = name;
        this.address = address;
        this.lat = lat;
        this.lng = lng;
        this.website = website;
        this.phoneNumber = phoneNumber;
        this.internationalPhoneNumber = internationalPhoneNumber;
    }

    public String getStandardPlaceId() {
        if (placeId <= 0)
            return googlePlaceId;
        return String.valueOf(placeId);
    }

    public LatLng toLatLng() {
        return new LatLng(lat, lng);
    }
    public MyLocation toMyLocation() {
        return new MyLocation(lat, lng);
    }
}
