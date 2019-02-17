package com.company.factory;

public class Sony implements Phone{
    @Override
    public void call() {
        System.out.println("Phone call from Sony...");
    }
}
