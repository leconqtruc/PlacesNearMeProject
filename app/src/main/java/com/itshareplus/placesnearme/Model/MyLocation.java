package com.itshareplus.placesnearme.Model;

import com.google.android.gms.maps.model.LatLng;

import org.simpleframework.xml.Attribute;

/**
 * Created by Mai Thanh Hiep on 4/23/2016.
 */

public class MyLocation {
    @Attribute
    public double latitude;
    @Attribute
    public double longitude;

    public MyLocation(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String distanceTo(MyLocation location) {
        double Radius = 6371000.0;// meter
        double dLat = Math.toRadians(this.latitude
                - location.latitude);
        double dLon = Math.toRadians(this.longitude
                - location.longitude);
        double a = Math.sin(dLat / 2) * Math.sin(dLat / 2)
                + Math.cos(Math.toRadians(this.latitude))
                * Math.cos(Math.toRadians(location.latitude))
                * Math.sin(dLon / 2) * Math.sin(dLon / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

        return String.format("%.2f km", Radius * c / 1000);
    }

    public LatLng toLatLng() {
        return new LatLng(this.latitude, this.longitude);
    }
}
