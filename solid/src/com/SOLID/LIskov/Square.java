package com.SOLID.LIskov;

public class Square implements Shape {

    public double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public void calculateArea(){
        System.out.println("Square : " + Math.pow(side,2));
    }
}
