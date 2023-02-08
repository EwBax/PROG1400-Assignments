package model;

import controller.ILoggable;

public class GPS implements ILoggable {

    private double latitude;
    private double longitude;


    // Constructor
    public GPS(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }


    @Override
    public String toString() {
        return (this.latitude + " " + this.longitude);
    }

    // Overriding interface methods
    @Override
    public void writeGPS() {
        System.out.println(this.toString());
    }


    // =============================================================================================
    // ==============================GETTERS AND SETTERS============================================
    // =============================================================================================

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}
