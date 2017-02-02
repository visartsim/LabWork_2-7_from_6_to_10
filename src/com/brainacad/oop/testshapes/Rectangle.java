package com.brainacad.oop.testshapes;

/**
 * Created by visartsim on 13.07.16.
 */
public class Rectangle extends Shape {
    private double width;
    private double height;

    Rectangle(String color, double width, double height){
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString(){
        return "This is Rectangle, color - " + super.getShapeColor()
                + ", width = " + width
                + ", height = " + height;
    }

    @Override
    public double calcArea(){
        return width*height;
    }
}
