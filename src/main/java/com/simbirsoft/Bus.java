package com.simbirsoft;

public class Bus extends Transport {

    public String numberRoute;

    protected Bus(String nameDriver, String carNumber, String numberRoute) {
        super(nameDriver, carNumber);
        this.numberRoute = numberRoute;
    }

    @Override
    public String moveObject(String nameDriver, String carNumber, String number) {
        return "ФИО водителя: " + nameDriver + "\n" + "Номер маршрута: " + numberRoute + "\n" +
                "Номер автобуса: " + carNumber;
    }
}
