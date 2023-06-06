package org.lessons.java.shop;

import java.math.BigDecimal;

public class TV extends Product{
    // Fields
    private int inch;
    private boolean smart;

    // Constructors
    public TV(String name, String description, BigDecimal price, BigDecimal iva, int inch, boolean smart) {
        super(name, description, price, iva);
        this.inch = inch;
        this.smart = smart;
    }

    // Getters and Setters

    public int getInch() {
        return inch;
    }

    public void setInch(int inch) {
        this.inch = inch;
    }

    public boolean isSmart() {
        return smart;
    }

    public void setSmart(boolean smart) {
        this.smart = smart;
    }
}
