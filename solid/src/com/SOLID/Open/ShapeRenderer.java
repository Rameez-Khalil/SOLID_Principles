package com.SOLID.Open;

public class ShapeRenderer {

    //Composition.
    private Shape shape;

    public ShapeRenderer(Shape shape) {
        this.shape = shape;
    }


    //draw the shape.
    public void drawShape(){
        shape.calculateArea();
    }
}
