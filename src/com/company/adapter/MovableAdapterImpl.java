package com.company.adapter;

public class MovableAdapterImpl implements MovableAdapter {

    private Movable luxuryCars;

    public MovableAdapterImpl(Movable luxuryCars) {
        this.luxuryCars = luxuryCars;
    }

    public Movable getLuxuryCars() {
        return luxuryCars;
    }

    public void setLuxuryCars(Movable luxuryCars) {
        this.luxuryCars = luxuryCars;
    }

    @Override
    public double getSpeed() {
        return convertMPHtoKPH(luxuryCars.getSpeed());
    }

    private double convertMPHtoKPH(double mph){
        return mph * 1.6;
    }
}
