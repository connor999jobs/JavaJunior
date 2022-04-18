package knu.mit.oop.constructor.hw;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Вадим", "Junior Java Developer", 700);
        System.out.println(person.summaryOfPerson(6));
    }
}
