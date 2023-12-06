package com.george.module1.three;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

        /**
         * Creates new shapes and checks their areas
         */

        ArrayList<CopyOfTwoDShape> shapes = new ArrayList<>();
        shapes.add(new Circle(5));
        shapes.add(new Triangle(1.0, 1.0, Math.sqrt(2)));
        shapes.add(new Triangle(4.0, 9.0));

        System.out.println(shapes);

        for (int i = 0; i<shapes.size(); i++){
            System.out.println(shapes.get(i).toString());
            System.out.println(shapes.get(i).getArea());
        }

    }


}
