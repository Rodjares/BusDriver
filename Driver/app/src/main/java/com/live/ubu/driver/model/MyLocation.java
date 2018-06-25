package com.live.ubu.driver.model;

/**
 * Created by wataru on 28/2/2561.
 */

public class MyLocation {
    String latitude, longitude;

    public MyLocation(String latitude, String longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public MyLocation(){}

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }
}
