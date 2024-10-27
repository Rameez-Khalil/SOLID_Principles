package com.SOLID.ISP;

public class Triangle implements TwoDimensionalShape{

    private int length, breadth;

    public Triangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public void calculateArea(){
        System.out.println("Area of triangle : " + 0.5*(breadth*length));
    }
}
