package com.company.singleton;

public class Main {

    public static void main(String[] args) {

        EagerSingleton eagerSingleton1 = EagerSingleton.getInstance();
        EagerSingleton eagerSingleton2 = EagerSingleton.getInstance();
        System.out.println("~~~EagerSingleton~~~");
        System.out.println(eagerSingleton1);
        System.out.println(eagerSingleton2);
        System.out.println();
        LazyInitializationSingleton lazyInitializationSingleton1 = LazyInitializationSingleton.getInstance();
        LazyInitializationSingleton lazyInitializationSingleton2 = LazyInitializationSingleton.getInstance();
        System.out.println("~~~LazyInitializationSingleton~~~");
        System.out.println(lazyInitializationSingleton1);
        System.out.println(lazyInitializationSingleton2);
    }
}
