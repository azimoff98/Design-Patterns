package com.company.factory;

public class PhoneFactory {

    public static Phone buildPhone(String model){
        if(model.equalsIgnoreCase("IPHONE")){
            return new Iphone();
        }
        if(model.equalsIgnoreCase("SAMSUNG")){
            return new Samsung();
        }
        if(model.equalsIgnoreCase("SONY")){
            return new Sony();
        }
        return null;
    }
}
