package com.company.decorator;

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Drawing circle");
    }

    @Override
    public void resize() {
        System.out.println("Resizing circle");
    }

    @Override
    public String description() {
        return "Circle object";
    }

    @Override
    public boolean isHide() {
        return false;
    }
}
