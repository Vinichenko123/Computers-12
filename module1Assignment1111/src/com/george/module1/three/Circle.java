package com.george.module1.three;
/**
 * Create circle shape, use PI and radius to get area
 */
class Circle extends CopyOfTwoDShape {
    public final double PI = Math.PI;
    private double radius;

    Circle(double radius){
        this.radius = radius;
    }

    public double getArea(){
        double circleArea = 2*PI+radius;
        return circleArea;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "PI=" + PI +
                ", radius=" + radius +
                '}';
    }




}