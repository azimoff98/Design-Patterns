package com.company.factory;

public class Iphone implements Phone {
    @Override
    public void call() {
        System.out.println("Phone call from Iphone...");
    }
}
