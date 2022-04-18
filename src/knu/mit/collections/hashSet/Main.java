package knu.mit.collections.hashSet;

import knu.mit.collections.arrayList.cw1.Car;

public class Main {
    public static void main(String[] args) {
        CarHashSet carHashSet = new CarHashSet();
        Car car = new Car("BMW",1);
        Car car2 = new Car("Audi",2);
        Car car3 = new Car("MB",3);
        carHashSet.add(car);
        carHashSet.add(car2);
        carHashSet.add(car3);
        System.out.println();
    }
}
