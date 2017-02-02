package com.brainacad.oop.testshapes;

/**
 * Created by visartsim on 13.07.16.
 */
public class Circle extends Shape {
    private double radius;

    Circle(String color, double radius){
        super(color);
        this.radius = radius;
    }

    @Override
    public String toString(){
        return "This is Circle, color - " + super.getShapeColor()
                + ", radius = " + radius;
    }

    @Override
    public double calcArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
