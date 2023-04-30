package com.company.jdk8.supplier.model;

import java.util.function.Supplier;

public class Car {

    private String brand = "BWM";

    private final String color = "white";

    public static Supplier<Car> supplierMapper = () -> new Car();

    @Override
    public String toString() {

        return "car{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
