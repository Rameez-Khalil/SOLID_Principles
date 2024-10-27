package com.SOLID.Open;

public class Triangle implements Shape {

    //Triangle members.
    private int breadth, height;

    public Triangle(int breadth, int height) {
        this.breadth = breadth;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        System.out.println("Triangle area " + 0.5 * breadth * height);
        return 0.5 * breadth * height;
    }
}
