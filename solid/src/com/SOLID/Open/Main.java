package com.SOLID.Open;

public class Main {

    public static void main(String[] args) {
        Shape rectangle = new Rectangle(10,10);
        Shape triangle = new Triangle(10,10);

        ShapeRenderer renderer = new ShapeRenderer(triangle);

        renderer.drawShape();


    }
}
