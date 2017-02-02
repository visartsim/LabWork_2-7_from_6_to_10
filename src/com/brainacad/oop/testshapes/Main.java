package com.brainacad.oop.testshapes;
//import com.brainacad.oop.testshapes.Shape.*;
//main class
public class Main {
    //entry point
    public static void main(String[] args) {
	// write your code here
        //Shape object
        Shape sh = new Shape("RED");
        System.out.println(sh.toString());
        System.out.println(Shape.shapeArea + sh.calcArea());

        //Circle object
        Circle cr = new Circle("YELLOW", 2);
        System.out.println(cr.toString());
        System.out.println(Shape.shapeArea + Math.round(cr.calcArea()));

        //Rectangle object
        Rectangle rect = new Rectangle("GREEN", 2, 3);
        System.out.println(rect.toString());
        System.out.println(Shape.shapeArea + rect.calcArea());

        //Triangle object
        Triangle tr = new Triangle("BLACK", 1, 2, 3);
        System.out.println(tr.toString());
        System.out.println(Shape.shapeArea + tr.calcArea());

        //Array of Shapes
        Shape[] masShapes = new Shape[9];
        int i=0,j=0;
        //part Array of Triangles
        for(; i<5; i++, j++){
            masShapes[i] = new Triangle(Shape.shapeColors[j], i+1, i+2, i+3);
        }
        //part Array of Circles
        for(j=0; i<7; i++, j++){
            masShapes[i] = new Circle(Shape.shapeColors[j], i);
        }
        //part Array of Rectangles
        for(; i<9; i++, j++){
            masShapes[i] = new Rectangle(Shape.shapeColors[j], i, i);
        }
        //print Array of Shapes and their areas
        System.out.println("***************************************************");
        for(Shape shp : masShapes){
            System.out.println(shp.toString() + " | " +  Shape.shapeArea + shp.calcArea());
        }
        //calc total area of all shapes
        System.out.println("***************************************************");
        double totalArea = 0, sumRectArea = 0, sumTriangleArea = 0, sumCircleArea = 0;
        for(Shape shp : masShapes){
            totalArea += shp.calcArea();
            if(shp instanceof Triangle)
                sumTriangleArea += shp.calcArea();
            if(shp instanceof Circle)
                sumCircleArea += shp.calcArea();
            if(shp instanceof Rectangle)
                sumRectArea += shp.calcArea();
        }
        System.out.println("Total area is " + totalArea);
        System.out.println("Triangle total area is " + sumTriangleArea);
        System.out.println("Circle total area is " + sumCircleArea);
        System.out.println("Rectangle total area is " + sumRectArea);
    }
}
