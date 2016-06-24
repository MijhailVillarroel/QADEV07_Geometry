package com.fundacionjala.figure;

/**
 * This class is Rectangle have inheritance with Shape
 * Calculate area and perimeter of a Rectangle
 *
 * @author Mijhail villarroel
 */
public class Rectangle extends Shape {

    private static final int FACTOR_FORMULA = 2;

    private final double sideA;

    private final double sideB;

    /**
     *Constructor of the Rectangle class
     * Receives one parameter radio of the Rectangle
     *
     * @param sideA
     * @param sideB
     */
    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    /**
     * {@inheritDoc}
     */
    public double calculateArea() {
        return sideA * sideB;
    }

    /**
     * {@inheritDoc}
     */
    public double calculatePerimeter() {
        return FACTOR_FORMULA * (sideA + sideB);
    }
}
