package com.george.module1.one;

/**
 * Create a two-dimensional shape like rectangle or square.
 * use width and height to get the area.
 */
public class TwoDShape {
    double width;
    double height;

    //Constructor with basic width and height variables
    public TwoDShape(double width, double height){
        this.width = width;
        this.height = height;
    }

    //TwoDShape default constructor
    public TwoDShape(){}
    public double getArea(){
        return width*height;
    }

    public void setHeight(double height){
        this.height = height;
    }
}
