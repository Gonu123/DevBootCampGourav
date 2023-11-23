package com.java.problem2.entities;

import com.java.problem2.Shapes;

public class Rectangle implements Shapes {

    private int length;
    private int width;

    public  Rectangle(int length,int width)
    {
        this.length=length;
        this.width=width;
    }

    @Override
    public int area(){
        return this.length*this.width;
    }

    @Override
    public int perimeter() {
        return (this.length+this.width)*2;
    }
}
