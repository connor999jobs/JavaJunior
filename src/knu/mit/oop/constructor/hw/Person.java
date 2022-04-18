package knu.mit.oop.constructor.hw;

public class Person {
    String name;
    String position;
    int salary;

    public Person(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    String summaryOfPerson(int i){
        return name + " за последние " + i +" месяцев получил " + salary*i + " $.";


    }
}
