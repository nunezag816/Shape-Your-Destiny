package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    private static final double DELTA = 0.001;

    @Test
    public void testCircle() {
        Circle c = new Circle(2);
        assertEquals(Math.PI * 4, c.getArea(), DELTA);
        assertEquals(2 * Math.PI * 2, c.getPerimeter(), DELTA);
    }

    @Test
    public void testRectangle() {
        Rectangle r = new Rectangle(3, 4);
        assertEquals(12, r.getArea(), DELTA);
        assertEquals(14, r.getPerimeter(), DELTA);
    }

    @Test
    public void testRightTriangle() {
        RightTriangle t = new RightTriangle(3, 4); // Hypotenuse = 5
        assertEquals(6, t.getArea(), DELTA);
        assertEquals(12, t.getPerimeter(), DELTA);
    }

    @Test
    public void testSquare() {
        Square s = new Square(5);
        assertEquals(25, s.getArea(), DELTA);
        assertEquals(20, s.getPerimeter(), DELTA);
    }

    @Test
    public void testIsoscelesRightTriangle() {
        IsoscelesRightTriangle t = new IsoscelesRightTriangle(5);
        assertEquals(0.5 * 5 * 5, t.getArea(), DELTA);
        double hypotenuse = Math.sqrt(2) * 5;
        assertEquals(5 + 5 + hypotenuse, t.getPerimeter(), DELTA);
    }

    @Test
    public void testParallelogram() {
        Parallelogram p = new Parallelogram(6, 4, 3);
        assertEquals(18, p.getArea(), DELTA);
        assertEquals(20, p.getPerimeter(), DELTA);
    }
}
