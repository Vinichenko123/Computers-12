package com.george.module1.three;

/**
 * Create a two-dimensional shape like rectangle or square.
 * use width and height to get the area.
 */

public abstract class CopyOfTwoDShape {
    public abstract double getArea();

    public abstract class TwoDShape {
        double width;
        double height;

        public TwoDShape(double width, double height){
            this.width = width;
            this.height = height;
        }
        public void setWidth(){
            this.width = width;
        }

        public void setHeight(){
            this.height = height;
        }

        public double getWidth(){
            return getWidth();
        }

        public double getHeight(){
            return getHeight();
        }


        public TwoDShape(){}
        public abstract double getArea();

        public void setHeight(double height){
            this.height = height;
        }


    }



}