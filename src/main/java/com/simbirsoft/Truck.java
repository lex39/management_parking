package com.simbirsoft;

public class Truck extends Transport{

    private String isLoaded;

    protected Truck(String nameDriver, String carNumber, String isLoaded) {
        super(nameDriver, carNumber);
        this.isLoaded = isLoaded;
    }

    @Override
    public String moveObject(String nameDriver, String carNumber) {
        return "ФИО водителя: " + nameDriver + "\n" + "Номер автобуса: " + carNumber
                + "\n" + "Номер маршрута: " + isLoaded;
    }
}
