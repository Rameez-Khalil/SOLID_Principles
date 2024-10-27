package com.SOLID.ISP;

import com.SOLID.LIskov.Shape;

public class TwoDimensionalRender {

    TwoDimensionalShape shape;

    public TwoDimensionalRender(TwoDimensionalShape shape) {
        this.shape = shape;
    }

    //calculate area only.
    public void render(){
        shape.calculateArea();
    }
}
