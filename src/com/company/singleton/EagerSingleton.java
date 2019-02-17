package com.company.singleton;

public class EagerSingleton {

    private static volatile EagerSingleton instance = new EagerSingleton();

    private EagerSingleton(){}

    public static EagerSingleton getInstance(){
        return instance;
    }
}
