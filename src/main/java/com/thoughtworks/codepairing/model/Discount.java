package com.thoughtworks.codepairing.model;

import java.util.Arrays;

public enum Discount {
    DIS_10("DIS_10", 0.1, 10),
    DIS_15("DIS_15", 0.15, 15),
    DIS_20("DIS_20", 0.2, 20),
    INVALID("", 0, 5);

    private final String code;
    private final double value;
    private final int points;

    Discount(String code, double value, int points) {
        this.code = code;
        this.value = value;
        this.points = points;
    }

    public static Discount info(String product) {
        return Arrays.stream(values())
                .filter(discount -> product.startsWith(discount.code))
                .findFirst()
                .orElse(INVALID);
    }

    public int getPoints() {
        return points;
    }

    public double getValue() {
        return value;
    }
}
