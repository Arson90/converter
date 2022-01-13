package com.company;

public class Pressure extends Converter{
    private final double psi = 14.5;

    Pressure(){
        System.out.println(this);
    }

    @Override
    public double count(double value) {
        return value * this.psi;
    }

    @Override
    public String toString() {
        return "Pressure{" +
                "1 bar = " + this.psi + " psi" +
                '}';
    }
}
