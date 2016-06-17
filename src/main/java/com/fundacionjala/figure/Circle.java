package com.fundacionjala.figure;

/**
 * Created by mijhailvillarroel on 6/16/2016.
 */
public class Circle extends Shape {

    public static final double PI = Math.PI;

    public static final int FACTOR_FORMULA = 2;

    private final double radio;

    public Circle(double radio) {
        this.radio = radio;
    }

    public double calculateArea() {
        return PI * Math.pow(radio, FACTOR_FORMULA);
    }

    public double calculatePerimeter() {
        return FACTOR_FORMULA * PI * radio;
    }

}
