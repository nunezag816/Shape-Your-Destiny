import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ShapeTest {

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
        assertEquals(12.0, r.getArea(), DELTA);
        assertEquals(14.0, r.getPerimeter(), DELTA);
    }

    @Test
    public void testRightTriangle() {
        RightTriangle rt = new RightTriangle(3, 4); // Hypotenuse = 5
        assertEquals(6.0, rt.getArea(), DELTA);
        assertEquals(12.0, rt.getPerimeter(), DELTA);
    }

    @Test
    public void testSquare() {
        Square s = new Square(5);
        assertEquals(25.0, s.getArea(), DELTA);
        assertEquals(20.0, s.getPerimeter(), DELTA);
    }

    @Test
    public void testIsoscelesRightTriangle() {
        IsoscelesRightTriangle t = new IsoscelesRightTriangle(5);
        double hypotenuse = Math.sqrt(2) * 5;
        assertEquals(12.5, t.getArea(), DELTA);
        assertEquals(5 + 5 + hypotenuse, t.getPerimeter(), DELTA);
    }

    @Test
    public void testParallelogram() {
        Parallelogram p = new Parallelogram(6, 4, 3);
        assertEquals(18.0, p.getArea(), DELTA);
        assertEquals(20.0, p.getPerimeter(), DELTA);
    }
}
