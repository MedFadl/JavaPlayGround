package com.medhat.ExcutiveFramework;

public class FlightQuote {
    private String site = null;
    private int price;

    FlightQuote(String site, int price) {
        this.site = site;
        this.price = price;
    }

    public String getSite() {
        return site;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "FlightQuote [site=" + site + ", price=" + price + "]";
    }
}
