package com.company.adapter;

public class Demo {
    public static void main(String[] args) {
        Movable mercedesE63 = new MercedesE63();
        MovableAdapter mercedesE63Adapter = new MovableAdapterImpl(mercedesE63);

        System.out.println(mercedesE63.getSpeed());
        System.out.println(mercedesE63Adapter.getSpeed());
    }
}
