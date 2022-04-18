package knu.mit.oop.first.hw2;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name ="Sharik";
        dog.breed ="Usual";
        dog.speed = 5;

        System.out.println(dog.info());
        dog.run();
    }
}
