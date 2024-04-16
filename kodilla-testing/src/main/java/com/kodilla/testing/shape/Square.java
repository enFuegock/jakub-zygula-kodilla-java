package com.kodilla.testing.shape;

public class Square implements Shape {
    private double sideLength;
    public Square(double sideLength) {
        this.sideLength = sideLength;
    }
    public double getSideLength() {
        return sideLength;
    }
    @Override
    public String getShapeName() {
        return "Square";
    }
    @Override
    public double getField() {
        return sideLength * sideLength;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Square square = (Square) o;

        return Double.compare(sideLength, square.sideLength) == 0;
    }
    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(sideLength);
        return (int) (temp ^ (temp >>> 32));
    }
}