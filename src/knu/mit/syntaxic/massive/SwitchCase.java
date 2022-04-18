package knu.mit.syntaxic.massive;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер месяца");
        int mouth = sc.nextInt();
        switch (mouth) {
//            case 1: System.out.println("Январь"); break;
//            case 2:System.out.println("Февраль"); break;
//            case 3:System.out.println("Март"); break;
//            case 4:System.out.println("Апрель"); break;
//            case 5:System.out.println("Май"); break;
//            case 6:System.out.println("Июнь"); break;
//            case 7:System.out.println("Июль"); break;
//            case 8:System.out.println("Август"); break;
//            case 9:System.out.println("Сентябрь"); break;
//            case 10:System.out.println("Октябрь"); break;
//            case 11:System.out.println("Ноябрь"); break;
//            case 12:System.out.println("Декабрь"); break;
//            default:System.out.println("Ошибка, такого месяца не существует.");
            case 12:
            case 1:
            case 2:
                System.out.println("Winter"); break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring"); break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer"); break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn"); break;
            default:
                System.out.println("Error");
        }
    }
    }

