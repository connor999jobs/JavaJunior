package knu.mit.oop.collectionss.hw2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            integerArrayList.add(i);
        }
//        for (int a: integerArrayList
//             ) {
//            System.out.println(a);
//
//        }

        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("Vadym");
        stringArrayList.add("Ivan");
        stringArrayList.add("Dima");
        stringArrayList.add("Oleg");
        stringArrayList.add("Sergey");
        stringArrayList.add("Maxim");
        stringArrayList.add("Andrey");
        stringArrayList.add("Vlad");
        stringArrayList.add("Valik");
        stringArrayList.add("Denis");
//        for (String s: stringArrayList
//             ) {
//            System.out.println(s);
//
//        }
//
        ArrayList<String> array = new ArrayList<>();
        for (int i =0; i < integerArrayList.size(); i++) {
            String s = integerArrayList.get(i) + " - " + stringArrayList.get(i);
            array.add(s);
        }

        for (String sq: array) {
            System.out.println(sq);

        }


    }
}
