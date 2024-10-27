package com.SOLID.Open;

public class Rectangle implements Shape{


    //Rectangle data members.
    private double length, breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double calculateArea(){
        System.out.println("Area of rectangle" + length*breadth);
        return length*breadth;
    }
}
