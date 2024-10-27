package com.abstractclass;

public class Circle extends Shape{


    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public void area() {
        System.out.println("Area : " + Math.pow(radius, 2) * 3.142);
    }
}
