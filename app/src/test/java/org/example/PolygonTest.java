package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PolygonTest {

    @Test
    public void testRectangleSides() {
        Polygon poly = new Rectangle(1, 2);
        assertEquals(4, poly.numberOfSides());
    }

    @Test
    public void testSquareSides() {
        Polygon poly = new Square(3);
        assertEquals(4, poly.numberOfSides());
    }

    @Test
    public void testRightTriangleSides() {
        Polygon poly = new RightTriangle(3, 4);
        assertEquals(3, poly.numberOfSides());
    }

    @Test
    public void testIsoscelesRightTriangleSides() {
        Polygon poly = new IsoscelesRightTriangle(4);
        assertEquals(3, poly.numberOfSides());
    }

    @Test
    public void testParallelogramSides() {
        Polygon poly = new Parallelogram(5, 3, 2);
        assertEquals(4, poly.numberOfSides());
    }
}
