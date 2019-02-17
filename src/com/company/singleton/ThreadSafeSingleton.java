package com.company.singleton;

import java.util.Objects;

public class ThreadSafeSingleton {

    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton(){}

    public static synchronized ThreadSafeSingleton getInstance(){
        if(Objects.isNull(instance)){
            instance = new ThreadSafeSingleton();
        }

        return instance;
    }




}
