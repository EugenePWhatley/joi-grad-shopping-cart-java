package com.thoughtworks.codepairing.model;

public class Product {
    private final double price;
    private final String productCode;
    private final String name;

    public Product(double price, String productCode, String name) {
        this.price = price;
        this.productCode = productCode;
        this.name = name;
    }

    public int loyaltyPointsEarned() {
        return (int) (price / Discount.info(productCode).getPoints());
    }

    public double discount() {
        return price * Discount.info(productCode).getValue();
    }

    public double totalPrice() {
        return price - discount();
    }

    public String toString() {
        return "- " + name + ", " + price;
    }
}
