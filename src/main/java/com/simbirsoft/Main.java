package com.simbirsoft;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Автоколонна - программа учета транспорта на предприятии.");

        while (true) {

            Scanner input = new Scanner(System.in);

            System.out.println("Автобус или Грузовое ТС?");
            System.out.println("1. Автобус.");
            System.out.println("2. Грузовое ТС.");
            System.out.println("3. Выход.");

            int menuCommand = input.nextInt();
            String carNumber;
            if (menuCommand == 1) {
                System.out.print("Введите имя Водителя: ");
                String nameDriver = input.next();

                System.out.print("Введите маршрут автобуса: ");
                String numberRoute = input.next();

                System.out.print("Введите номер автобуса: ");
                carNumber = CarNumber.getCarNumber();

                Bus bus = new Bus(nameDriver, carNumber, numberRoute);

            } else if (menuCommand == 2) {
                System.out.print("Введите имя Водителя: ");
                String nameDriver = input.next();

                System.out.print("Введите номер Грузового ТС: ");
                carNumber = input.next();

                System.out.print("Грузовик загружен? да/нет: ");
                String isLoaded = input.next();

                Truck truck = new Truck(nameDriver, carNumber, isLoaded);
            } else if (menuCommand == 3) {
                break;
            } else {
                System.out.println("Не понял команды. Повторите.");
            }

//            System.out.println("ТС выезжает или въезжает на территорию?");
//            System.out.println("1. <= Въезжает.");
//            System.out.println("2. => Выезжает.");
//            System.out.println("3. Выход.");
//
//            int command = input.nextInt();
//            if (command == 1) {
//                InCar.menuInCar();
//            } else if (command == 2) {
//
//            } else if (command == 3) {
//                break;
//            } else {
//                System.out.println("Не понял команды. Повторите.");
//            }
        }
    }
}

