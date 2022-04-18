package knu.mit.collections.TreeSet;

import knu.mit.collections.HashMap.CarOwner;
import knu.mit.collections.arrayList.cw1.Car;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
//        Set<Car> cars = new TreeSet<>(new Comparator<Car>() {
//            @Override
//            public int compare(Car car, Car t1) {
//                return car.getBrand().compareTo(t1.getBrand());
//            }
//        });
//        for (int i = 0; i < 100; i++) {
//            cars.add(new Car("Brand " + i,i));
//        }
//        for (Car car: cars) {
//            System.out.println(car);
//
//        }

        HashMap<CarOwner, Car> map = new HashMap<>();
        CarOwner key = new CarOwner(1,"Name","LastName");
        map.put(key,new Car("Brand 1 ", 1));
        key.setId(8);
        for (CarOwner carOwner : map.keySet()) {
            System.out.println(carOwner.getId());

        }
//        Car car = map.get(key);
//        System.out.println(car.getBrand());
    }
}
