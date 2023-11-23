package com.java.problem2.entities;

import com.java.problem2.Shapes;

public class Square implements Shapes {
    private int length;

    public Square(int length)
    {
        this.length=length;
    }

    @Override
    public int area(){
        return this.length*this.length;
    }

    @Override
    public int perimeter() {
        return (this.length+this.length)*2;
    }
}
