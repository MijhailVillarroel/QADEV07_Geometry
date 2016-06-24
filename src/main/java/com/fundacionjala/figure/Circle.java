package com.fundacionjala.figure;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

/**
 * This class is Circle have inheritance with Shape
 * Calculate area and perimeter of a circle
 *
 * @author Mijhail villarroel
 */
public class Circle extends Shape {

    private static final int FACTOR_FORMULA = 2;

    private final double radio;

    /**
     *Constructor of the circle class
     * Receives one parameter radio of the circle
     *
     * @param radio
     */

    public Circle(double radio) {
        this.radio = radio;
    }

    /**
     * {@inheritDoc}
     */
    public double calculateArea() {
        return PI * pow(radio, FACTOR_FORMULA);
    }

    /**
     * {@inheritDoc}
     */
    public double calculatePerimeter() {
        return FACTOR_FORMULA * PI * radio;
    }

}
