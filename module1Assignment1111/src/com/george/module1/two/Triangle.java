package com.george.module1.two;

/**
 * Creating triangle shape and using herons formula to get the area with the parameters provided in the constructor
 * use to string method to print the variables in main method
 */
class Triangle extends CopyOfTwoDShape {
    double side1;
    double side2;
    double side3;
    double width;
    double height;
    public Triangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    public Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    /**
     * Compute height of triangle
     * Use herons formula to get height
     * @return the area of triangle
     */
    private double heronsHeight(){
        double semiPerimeter = side1+side2+side3*.5;
        double heronsArea = Math.sqrt(semiPerimeter*(semiPerimeter-side1)*(semiPerimeter-side2)*(semiPerimeter-side3));
        double heronsHeight = heronsArea*2/side2;
        return heronsHeight;
    }


    /**
     * Compute area of triangle
     * Plug into herons formula to get area using sides provided.
     * Plug into base times height divided by two formula, using base and height provided.
     * @return the area of triangle
     */
    @Override
    public double getArea(){
        if (side1 != 0.0 && side2 != 0.0 && side3 != 0.0) {
            double semiPerimeter = (side1 + side2 + side3) * 0.5;
            double heronsArea = Math.sqrt(semiPerimeter * (semiPerimeter - side1) * (semiPerimeter - side2) * (semiPerimeter - side3));
            return heronsArea;
        } else {
            return 0.5 * width * height;
        }
    }


    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}