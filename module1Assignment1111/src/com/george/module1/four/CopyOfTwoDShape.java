package com.george.module1.four;

public abstract class CopyOfTwoDShape {
    public abstract double getArea();


    public abstract class TwoDShape {
        double width;
        double height;

        Colour colour;
        public TwoDShape(double width, double height, Colour colour){
            this.width = width;
            this.height = height;
            this.colour = colour;

        }
        public void setWidth(){
            this.width = width;
        }

        public void setHeight(){
            this.height = height;
        }

        public void setColour(){this.colour = colour;}
        public double getWidth(){
            return getWidth();
        }

        public double getHeight(){
            return getHeight();
        }

        public Colour getColour() {
            return colour;
        }

        public TwoDShape(){}
        public abstract double getArea();

        public void setHeight(double height){
            this.height = height;
        }
    }



}