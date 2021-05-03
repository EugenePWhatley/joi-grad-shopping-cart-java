package com.thoughtworks.codepairing.model;

import java.util.List;
import java.util.stream.Collectors;

public class ShoppingCart {
    private final List<Product> products;
    private final Customer customer;

    public ShoppingCart(Customer customer, List<Product> products) {
        this.customer = customer;
        this.products = products;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public int loyaltyPointsEarned() {
        return products
                .stream()
                .mapToInt(Product::loyaltyPointsEarned)
                .sum();
    }

    public double totalPrice() {
        return products
                .stream()
                .mapToDouble(Product::totalPrice)
                .sum();
    }

    public Order checkout() {
        return new Order(totalPrice(), loyaltyPointsEarned());
    }

    @Override
    public String toString() {
        return "Customer: " +
                customer.getName() +
                "\nBought:  \n" +
                products.stream().map(Product::toString).collect(Collectors.joining("\n"));
    }
}
