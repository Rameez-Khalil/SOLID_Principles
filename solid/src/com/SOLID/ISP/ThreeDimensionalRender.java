package com.SOLID.ISP;

public class ThreeDimensionalRender {

    ThreeDimensionalShape shape;

    public ThreeDimensionalRender(ThreeDimensionalShape shape) {
        this.shape = shape;
    }

    //calculate area.
    public void render(){
        shape.calculateArea();
        shape.calculateCube();
    }
}
