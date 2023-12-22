package com.george.module1.two;

/**
 * Create circle shape, use PI and radius to get area
 */
public class Circle extends CopyOfTwoDShape {
    public final double PI = Math.PI;
    private double radius;

    Circle(double radius){
        this.radius = radius;
    }

    public double getArea(){
        double circleArea =  PI*radius*radius;
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