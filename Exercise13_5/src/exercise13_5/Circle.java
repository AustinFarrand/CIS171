/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise13_5;

/**
 *
 * @author af0054085
 */
public class Circle extends GeometricObject{
    private double radius;
    
    public Circle(double radius){
        this.radius = radius;
    }
    
    public Circle(double radius, String color, String filled){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return radius * radius* Math.PI;
    }
    @Override
    public double getPerimeter(){
        return 2 * radius * Math.PI;
    }
    
}
