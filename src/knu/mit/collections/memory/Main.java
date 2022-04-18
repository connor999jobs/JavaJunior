package knu.mit.collections.memory;

import knu.mit.collections.arrayList.cw1.Car;

public class Main {
    public static void main(String[] args) {


        Car car = new Car("BMW", 1);
        Car car2 = new Car("BMW", 1);
        System.out.println(car.equals(car2));
    }

}
