package com.SOLID.ISP;

import com.SOLID.LIskov.Shape;
import com.SOLID.LIskov.Square;

public class Main {

    public static void main(String[] args) {
        ThreeDimensionalShape cube = new Cube(10);

        ThreeDimensionalRender threeDRender = new ThreeDimensionalRender(cube);
        threeDRender.render();

        //Two-D shape

        TwoDimensionalShape triangle = new Triangle(10,10);
        TwoDimensionalRender twoDimensionalRender = new TwoDimensionalRender(triangle);

        twoDimensionalRender.render();


    }
}
