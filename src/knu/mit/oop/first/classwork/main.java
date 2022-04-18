package knu.mit.oop.first.classwork;

public class main {
    public static void main(String[] args) {
        Box box = new Box();
        box.h = 10.2;
        box.l = 15;
        box.w = 11.3;
        double volume1= box.volume();
        System.out.println(volume1);

    }
}
