package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PolygonTest {

    @Test
    public void testRectangleSides() {
        Polygon p = new Rectangle(2, 3);
        assertEquals(4, p.numberOfSides());
    }

    @Test
    public void testSquareSides() {
        Polygon p = new Square(4);
        assertEquals(4, p.numberOfSides());
    }

    @Test
    public void testRightTriangleSides() {
        Polygon p = new RightTriangle(3, 4);
        assertEquals(3, p.numberOfSides());
    }

    @Test
    public void testIsoscelesRightTriangleSides() {
        Polygon p = new IsoscelesRightTriangle(5);
        assertEquals(3, p.numberOfSides());
    }

    @Test
    public void testParallelogramSides() {
        Polygon p = new Parallelogram(5, 3, 2);
        assertEquals(4, p.numberOfSides());
    }

    // Negative Test: Circle does NOT implement Polygon
    @Test
    public void testCircleDoesNotImplementPolygon() {
        Circle c = new Circle(1);
        assertFalse(c instanceof Polygon);
    }
}
