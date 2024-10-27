package com.SOLID.LIskov;

public class Rectangle implements Shape{


    private double length, breadth;


    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public void calculateArea(){
        System.out.println("Rectangle Area : " + length*breadth);
    }
}
