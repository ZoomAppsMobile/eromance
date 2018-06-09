package com.zoomapps.eromance.Models;


public class ModelAddBalance {

    public float getPrice() {
        return price;
    }

    public float getExchange_coins() {
        return exchange_coins;
    }

    public String getCurrency() {
        return currency;
    }

    public boolean is_check() {
        return is_check;
    }

    private float price,exchange_coins;
    private String currency="KZT";
    private boolean is_check = false;
}
