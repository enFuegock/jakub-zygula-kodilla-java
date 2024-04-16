package com.kodilla.testing.shape;

public class Triangle implements Shape {
    private double base;
    private double perpendicularHeight;
    public Triangle(double base, double perpendicularHeight) {
        this.base = base;
        this.perpendicularHeight = perpendicularHeight;
    }
    public double getBase() {
        return base;
    }
    public double getPerpendicularHeight() {
        return perpendicularHeight;
    }
    @Override
    public String getShapeName() {
        return "Triangle";
    }
    @Override
    public double getField() {
        return 0.5 * base * perpendicularHeight;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Triangle triangle = (Triangle) o;

        if (Double.compare(base, triangle.base) != 0) return false;
        return Double.compare(perpendicularHeight, triangle.perpendicularHeight) == 0;
    }
    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(base);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(perpendicularHeight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}