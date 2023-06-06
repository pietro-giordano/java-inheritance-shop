package org.lessons.java.shop;

import java.math.BigDecimal;

public class Smartphone extends Product {
    // Fields
    private int IMEI;
    private int storage;

    // Constructors
    public Smartphone(String name, String description, BigDecimal price, BigDecimal iva, int IMEI, int storage) {
        super(name, description, price, iva);
        this.IMEI = IMEI;
        this.storage = storage;
    }

    // Getters and Setters

    public int getIMEI() {
        return IMEI;
    }

    public void setIMEI(int IMEI) {
        this.IMEI = IMEI;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    // Methods

    @Override
    public String toString() {
        return "Smartphone{" +
                super.toString() +
                ", IMEI=" + IMEI +
                ", storage=" + storage +
                '}';
    }
}
