package com.simbirsoft;

public abstract class Transport {

    protected String nameDriver;
    protected String carNumber;

    protected Transport(String nameDriver, String carNumber) {
        this.nameDriver = nameDriver;
        this.carNumber = carNumber;
    }

    public abstract String moveObject(String nameDriver, String carNumber, String number);
}
