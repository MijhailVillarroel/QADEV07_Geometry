package com.fundacionjala.figure;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static com.fundacionjala.figure.Constant.DELTA;

/**
 * Tests for {@link Circle}
 */
public class TestCircle {

    private Shape circle;

    @Before
    public void setup() {
        final double radio = 5.5;
        circle = new Circle(radio);
    }

    @Test
    public void testCalculateArea() {
        final double expectResultArea = 95.0334;
        assertEquals(expectResultArea, circle.calculateArea(), DELTA);
    }

    @Test
    public void testCalculatePerimeter() {
        final double expectResultPerimeter = 34.55;
        assertEquals(expectResultPerimeter, circle.calculatePerimeter(), DELTA);
    }
}
