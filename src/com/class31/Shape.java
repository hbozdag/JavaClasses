package com.class31;

public interface Shape {
    double pi = 3.14;
    double calculateArea(double radius);
    double calculatePerimeter(double radius);
}
class Circle implements Shape {
    double area;
    double perimeter;
    @Override
    public double calculateArea(double radius) {
        area = pi * radius * radius;
     
        return area;
    }
    @Override
    public double calculatePerimeter(double radius) {
        perimeter = 2 * pi * radius;
       
        return perimeter;
    }
}
class Square implements Shape {
    double area;
    double perimeter;
    @Override
    public double calculateArea(double side) {
        area = side * side;
       
        return area;
    }
    @Override
    public double calculatePerimeter(double side) {
        perimeter = 4 * side;
       
        return perimeter;
    }
}
