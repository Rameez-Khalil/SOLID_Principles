package com.SOLID.ISP;

public class Cube implements ThreeDimensionalShape{


    private int side;

    public Cube(int side) {
        this.side = side;
    }



    @Override
    public void calculateArea(){
        System.out.println("Area : " + 6*(Math.pow(side,2)));
    }

    @Override
    public void calculateCube(){
        System.out.println("Cube : " + (Math.pow(side,3)));
    }
}
