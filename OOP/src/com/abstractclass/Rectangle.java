package com.abstractclass;

public class Rectangle extends Shape {

    int length;
    int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public void area() {
        System.out.println(length * breadth);
    }
}
