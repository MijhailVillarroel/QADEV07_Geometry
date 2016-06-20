package com.fundacionjala.figure;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static com.fundacionjala.figure.Constant.DELTA;

/**
 * Created by mijhailvillarroel on 6/16/2016.
 */
public class TestRectangle {

    private Shape rectangle;

    @Before
    public void setup() {
        final double sideA = 5.2;
        final double sideB = 6.2;
        rectangle = new Rectangle(sideA, sideB);
    }

    @Test
    public void testCalculateArea() {
        final double expectResultArea = 32.24;
        assertEquals(expectResultArea, rectangle.calculateArea(), DELTA);
    }

    @Test
    public void testCalculatePerimeter() {
        final double expectResultPerimeter = 22.8;
        assertEquals(expectResultPerimeter, rectangle.calculatePerimeter(), DELTA);
    }
}
