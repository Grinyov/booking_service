package com.grinyov.model;

/**
 * Created by vgrinyov.
 */
public class HotelBooking {
    private String hotelName;
    private double pricePerNight;
    private int numOfNight;

    public HotelBooking(String hotelName, double pricePerNight, int numOfNight) {
        this.hotelName = hotelName;
        this.pricePerNight = pricePerNight;
        this.numOfNight = numOfNight;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(double pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public int getNumOfNight() {
        return numOfNight;
    }

    public void setNumOfNight(int numOfNight) {
        this.numOfNight = numOfNight;
    }

    public double getTotalPrice(){
        return pricePerNight * numOfNight;
    }
}
