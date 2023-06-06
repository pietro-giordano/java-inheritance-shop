package org.lessons.java.shop;

import java.math.BigDecimal;
import java.util.Random;

public class Product {
    // Fields
    private int code;
    private String name;
    private String description;
    private BigDecimal price;
    private BigDecimal iva;

    // Constructors
    public Product(String name, String description, BigDecimal price, BigDecimal iva) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.iva = iva;
        this.code = generateCode();
    }

    // Getters and Setters
    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getIva() {
        return iva;
    }

    public void setIva(BigDecimal iva) {
        this.iva = iva;
    }

    public String getCodeName() {

        return this.code + "-" + this.name;
    }

    // Methods
    public BigDecimal getIvaPrice() {
        return this.price.add(price.multiply(this.iva));
    }

    private int generateCode() {
        Random code = new Random();
        return code.nextInt(89999999) + 10000000;
    }
}

