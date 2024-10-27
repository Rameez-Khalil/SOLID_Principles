package com.SOLID.LIskov;

public class Renderer {

    Shape shape;

    public Renderer(Shape shape) {
        this.shape = shape;
    }


    public void renderShape(){
        shape.calculateArea();
    }
}
