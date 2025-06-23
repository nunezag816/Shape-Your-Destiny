public class Square extends Rectangle implements Polygon {

    public Square(double side) {
        super(side, side);
    }

    @Override
    public int numberOfSides() {
        return 4;
    }
}
