package com.SOLID.Single;

public class Rectangle implements Shape {

    //Properties of rectangle.
    private double width, height;


    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }


    @Override
    public double calculateArea() {
        System.out.println("Area of rectangle : " + width * height);
        return width*height;
    }
}
