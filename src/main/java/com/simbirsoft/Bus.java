package com.simbirsoft;

public class Bus extends Transport {

    public String numberRoute;

    protected Bus(String nameDriver, String carNumber, String numberRoute) {
        super(nameDriver, carNumber);
        this.numberRoute = this.numberRoute;
    }

    @Override
    public String moveObject(String nameDriver, String carNumber) {
        return "ФИО водителя: " + nameDriver + "\n" + "Номер автобуса: " + carNumber
                + "\n" + "Номер маршрута: " + numberRoute;
    }
}
