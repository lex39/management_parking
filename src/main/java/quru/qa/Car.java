package quru.qa;

public class Car {

    String name;
    int yearOfProduction;
    int price;
    String color;
    private int distance = 0;

    public Car(String name, int yearOfProduction, int price, String color) {
        this.name = name;
        this.yearOfProduction = yearOfProduction;
        this.price = price;
        this.color = color;
    }

    public void addDistance(int additinalDistance) {
        distance += additinalDistance;
    }

    public int getDistance() {
        return distance;
    }

    public void checkYearOfProduction (int yearOfProduction) {
        if (yearOfProduction < 2004) {
            System.out.println( "name='" + name + ", yearOfProduction=" + yearOfProduction + " do not buy!");
        }
        else {
            System.out.println( "name='" + name + ", yearOfProduction=" + yearOfProduction + " yes, buy!");
        }
        return;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", distance=" + distance +
                '}';
    }
}
