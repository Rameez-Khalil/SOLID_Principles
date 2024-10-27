package com.SOLID.LIskov;

public class Main {

    public static void main(String[] args) {
        Shape rectangle = new Rectangle(10,10);
        Shape square = new Square(10);

        Renderer renderer = new Renderer(square);

        renderer.renderShape();

    }
}
