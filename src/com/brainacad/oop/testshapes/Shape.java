package com.brainacad.oop.testshapes;

/**
 * Created by visartsim on 13.07.16.
 */
public class Shape {
    private String shapeColor;
    public static final String shapeArea = "Shape area is: ";
    public static final String[] shapeColors = {"RED", "BLACK", "GREEN", "YELLOW", "WHITE"};

    Shape(String shapeColor){
        this.shapeColor = shapeColor;
    }

    public String getShapeColor(){
        return shapeColor;
    }

    @Override
    public String toString(){
        return "Shape, color is: " + shapeColor;
    }

    public double calcArea(){
        return 0.0;
    }
}
