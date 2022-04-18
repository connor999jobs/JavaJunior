package knu.mit.oop.collectionss.clasw1.main;

public class Main {
    public static void main(String[] args) {
        MyArrayList employees = new MyArrayList();
        employees.add("Vadym");
        employees.add("Andrey");
        employees.add("Dima");
        employees.add("Sergey");

        for (int i = 0; i < employees.getSize(); i++) {
            System.out.println(employees.get(i));
        }
    }
}
