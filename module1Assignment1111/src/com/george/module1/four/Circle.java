package com.george.module1.four;
/**
 * Create circle shape, use PI and radius to get area
 */
class Circle extends CopyOfTwoDShape {
    public final double PI = Math.PI;
    private double radius;
    Colour colour;

    Circle(double radius, Colour colour){
        this.radius = radius;
        this.colour = colour;
    }

    @Override
    public double getArea(){
        double circleArea =  PI*radius*radius;
        return circleArea;
    }


    @Override
    public String toString() {
        return "Circle{" +
                "PI=" + PI +
                ", radius=" + radius +
                ", colour=" + colour +
                '}';
    }
}