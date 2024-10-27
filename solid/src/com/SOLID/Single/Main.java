package com.SOLID.Single;

public class Main {

    public static void main(String[] args) {
        Shape rectangle = new Rectangle(10, 10);
        ShapeRenderer renderer = new ShapeRenderer(rectangle);

        renderer.drawShape();

    }
}
