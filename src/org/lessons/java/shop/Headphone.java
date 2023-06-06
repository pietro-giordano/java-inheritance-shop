package org.lessons.java.shop;

import java.math.BigDecimal;

public class Headphone extends Product{
    // Fields
    private String color;
    private boolean wireless;

    // Constructors
    public Headphone(String name, String description, BigDecimal price, BigDecimal iva, String color, boolean wireless) {
        super(name, description, price, iva);
        this.color = color;
        this.wireless = wireless;
    }

    // Getters and Setters

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isWireless() {
        return wireless;
    }

    public void setWireless(boolean wireless) {
        this.wireless = wireless;
    }
}
