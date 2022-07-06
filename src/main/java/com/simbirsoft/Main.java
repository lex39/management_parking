package com.simbirsoft;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Программа для учета въезжающего траспорта.");

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

                Bus bus = new Bus(nameDriver, numberRoute, carNumber);
                String outString = bus.moveObject(nameDriver, numberRoute, carNumber);
                System.out.println(outString);
                System.out.println("************");
                System.out.println();
            } else if (menuCommand == 2) {
                System.out.print("Введите имя Водителя: ");
                String nameDriver = input.next();

                System.out.print("Грузовик загружен? да/нет: ");
                String isLoaded = input.next();

                System.out.print("Введите номер Грузового ТС: ");
                carNumber = CarNumber.getCarNumber();

                Truck truck = new Truck(nameDriver, carNumber, isLoaded);
                String outString = truck.moveObject(nameDriver, carNumber, isLoaded);
                System.out.println(outString);
                System.out.println("************");
                System.out.println();
            } else if (menuCommand == 3) {
                break;
            } else {
                System.out.println("Не понял команды. Повторите.");
            }
        }
    }
}

