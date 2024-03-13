package com.company;

public class Rectangle {
    double width, height;

    public Rectangle(){
    }
    public Rectangle(double allSize){
        this.width = allSize;
        this.height = allSize;
    }
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    public double getArea(){
        return this.width*this.height;
    }
    public double getParimeter(){
        return 2*(this.width+this.height);
    }
}
