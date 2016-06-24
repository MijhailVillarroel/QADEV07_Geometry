package com.fundacionjala.figure;


/**
 * This class is Square have inheritance with Shape
 * Calculate area and perimeter of a square
 *
 * @author Mijhail villarroel
 */
public class Square extends Rectangle {

    /**
     *Constructor of the Square class
     * Receives one parameter radio of the Square
     *
     * @param side
     */
    public Square(double side) {
        super(side, side);
    }
}
