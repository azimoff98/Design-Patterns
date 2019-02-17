package com.company.factory;

public class Main {
    public static void main(String[] args) {
        Phone phone1 = PhoneFactory.buildPhone("IPHONE");
        phone1.call();

        Phone phone2 = PhoneFactory.buildPhone("SAMSUNG");
        phone2.call();

        Phone phone3 = PhoneFactory.buildPhone("SONY");
        phone3.call();
    }
}
