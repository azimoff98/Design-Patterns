package com.company.singleton;

import java.util.Objects;
/**
 *This kind of implementation works fine in case of a single-threaded environment,
 * but when it comes to multithreaded systems, it can cause issues if multiple
 * threads are inside the if loop at the same time. It will destroy the singleton
 * pattern, and both threads will get the different instances of the singleton class.
 *
 * NOT THREADSAFE !!!
 */
public class LazyInitializationSingleton {


    private static LazyInitializationSingleton instance;

    private LazyInitializationSingleton(){

    }

    public static LazyInitializationSingleton getInstance(){
        if(Objects.isNull(instance)){
            instance = new LazyInitializationSingleton();
        }
        return instance;
    }
}
