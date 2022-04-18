package knu.mit.oop.first.hw;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Vadym", 30,75.5);
        Person person2 = new Person("Dima", 25,85.5);
        Person person3 = new Person("Andrey", 40,80.5);

        int ageAv = (person1.age + person2.age + person3.age) /3;
        System.out.println(ageAv);
    }
}
