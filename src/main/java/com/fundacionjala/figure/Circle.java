package com.fundacionjala.figure;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

/**
 * Created by mijhailvillarroel on 6/20/2016.
 */
public class Circle extends Shape {

    private static final int FACTOR_FORMULA = 2;

    private final double radio;

    public Circle(double radio) {
        this.radio = radio;
    }

    /**
     * {@inheritDoc}
     */
    public double calculateArea() {
        return PI * pow(radio, FACTOR_FORMULA);
    }

    public double calculatePerimeter() {
        return FACTOR_FORMULA * PI * radio;
    }

}
