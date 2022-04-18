package knu.mit.oop.exception;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>(3);
        integers.add(1);
        integers.add(2);
        integers.add(3);
        for (Integer s: integers) {
            System.out.println(s);
        }
        try {
            integers.get(4);
        } catch (IndexOutOfBoundsException e){
            System.out.println("Такого элемента не существует");
        }

    }
}
