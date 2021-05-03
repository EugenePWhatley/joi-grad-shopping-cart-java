package com.thoughtworks.codepairing.model;

public class Order {
    private final double totalPrice;
    private final int loyaltyPoints;

    public Order(double totalPrice, int loyaltyPointsEarned) {
        this.totalPrice = totalPrice;
        this.loyaltyPoints = loyaltyPointsEarned;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public int getLoyaltyPoints() {
        return loyaltyPoints;
    }

    @Override
    public String toString() {
        return "Total price: " + totalPrice + "\n" + "Will receive " + loyaltyPoints + " loyalty points";
    }
}
