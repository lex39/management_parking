package quru.qa;

public class Main {

    public static void main(String[] args) {

        Car audi = new Car("AUDI", 2002, 5000, "white");
        Car bmw = new Car("BMW", 2005, 7000, "silver");

        audi.addDistance(223000);
        bmw.addDistance(125000);

        audi.checkYearOfProduction(audi.yearOfProduction);
        bmw.checkYearOfProduction(bmw.yearOfProduction);

        System.out.println(audi);
        System.out.println(bmw);

    }
}
