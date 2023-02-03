package com.example.team41;

public class Rectangle extends Shape{
    private int height;
    private int width;

    Rectangle (int x, int y) {
        this.height = x;
        this.width = y;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getArea() {
        return height*width;
    }
}
