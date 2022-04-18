package knu.mit.syntaxic.booleans;

import java.util.Scanner;

// написать программу которая принимает 2 значение булеан 1 это ночь 2 хорошая погода
// если ночь спать
// если день и хорошая погода идти гулять
// если день и плохая погода читать книгу
// else не использувать
public class Bolleans {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter hours");
        int hours = sc.nextInt();
        System.out.println("Good of bad Weather");
       boolean weather = sc.nextBoolean();
       if (weather == true){
           System.out.println("Good Weather");
       } else if (weather == false){
           System.out.println("Bad Weather");
       }

        boolean day = hours >= 23 || hours <= 8;

//        boolean weather = true;

        if (!day && weather){
            System.out.println("Идти гулять");
        }
        if (day) {
            System.out.println("Идти спать");
        }
        if (!day && !weather){
            System.out.println("Читать книгу");
        }

    }

}
