package knu.mit.syntaxic.massive;

import java.util.Scanner;

public class Mouth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер месяца");
        int mouth = sc.nextInt();

        if (mouth == 1){
            System.out.println("Январь");
        } else if (mouth ==2){
            System.out.println("Февраль");
        }
        else if (mouth ==3){
            System.out.println("Март");
        }
        else if (mouth ==4){
            System.out.println("Апрель");
        }
        else if (mouth ==5){
            System.out.println("Май");
        }
        else if (mouth ==6){
            System.out.println("Июнь");
        }
        else if (mouth ==7){
            System.out.println("Июль");
        }
        else if (mouth ==8){
            System.out.println("Август");
        }
        else if (mouth ==9){
            System.out.println("Сентябрь");
        }
        else if (mouth ==10){
            System.out.println("Октябрь");
        }
        else if (mouth ==11){
            System.out.println("Ноябрь");
        }
        else if (mouth ==12){
            System.out.println("Декабрь");
        } else{
            System.out.println("Ошибка, такого месяца не существует.");
        }



    }
}
