package knu.mit.oop.inheritance.hw1;

public class Main {
    public static void main(String[] args) {


        Box box = new Box(20, 5, 8);
        BoxWeight boxWeight = new BoxWeight(25, 10, 15,20);
        box.showInfo();
        boxWeight.showInfo();
    }
}