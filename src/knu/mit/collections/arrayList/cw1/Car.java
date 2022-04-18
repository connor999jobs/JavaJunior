package knu.mit.collections.arrayList.cw1;

import java.util.Objects;

public class Car { //implements Comparable<Car> {
    private String brand;
    private int number;

    public Car(String name, int number) {
        this.brand = name;
        this.number = number;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

//    @Override
//    public boolean equals(Object obj) {
//        if (obj instanceof Car){
//            Car car = (Car) obj;
//            return car.brand.equals(this.brand) && car.number == this.number;
//        } else {
//            return false;
//        }
//    }
//
//    @Override
//    public int hashCode() {
//        return brand.hashCode() + number;
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return number == car.number && Objects.equals(brand, car.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, number);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + brand + '\'' +
                ", number=" + number +
                '}';
    }

//    @Override
//    public int compareTo(Car o) {
//        return brand.compareTo(o.brand);
//    }
}
