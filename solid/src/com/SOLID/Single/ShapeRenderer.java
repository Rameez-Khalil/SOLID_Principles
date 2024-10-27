package com.SOLID.Single;

public class ShapeRenderer {

    Shape shape;

    public ShapeRenderer(Shape shape) {
        this.shape = shape;
    }

    public void drawShape(){
        shape.calculateArea();
    }
}
