package knu.mit.oop.toString;

public class Main {
    public static void main(String[] args) {
        int a = (int) (Math.random() *90 +10);
        String s = String.format("Your Number is %s ", a);
        System.out.println(s);
        for (int i = a; i == 50 ; i++) {
            System.out.println("You winner");
        }
        System.out.println("Try Again");
    }
}
