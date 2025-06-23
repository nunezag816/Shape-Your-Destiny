package org.example;

public class IsoscelesRightTriangle extends RightTriangle implements Polygon {

    public IsoscelesRightTriangle(double leg) {
        super(leg, leg);
    }

    @Override
    public int numberOfSides() {
        return 3;
    }
}
