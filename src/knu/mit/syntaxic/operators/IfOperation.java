package knu.mit.syntaxic.operators;

import java.util.Scanner;

public class IfOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your money");
       int money = sc.nextInt();

       String sushi = "Sushi";
       String pizza = "Pizza";
       String doshik = "Doshik";
       if (money > 400){
           System.out.println("Buy " +sushi);
       }
       else if (money < 400 && money > 200){
           System.out.println("Buy " + pizza);
       }
       else if (money > 50) {
           System.out.println("Buy " + doshik);
       }
       else if (money < 50){
           System.out.println("You don't have money for food");
       }
       sc.close();
    }
}
