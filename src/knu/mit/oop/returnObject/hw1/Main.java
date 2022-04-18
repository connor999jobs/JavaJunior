package knu.mit.oop.returnObject.hw1;

public class Main {
    public static void main(String[] args) {

        Box box1 = new Box(3,4,6);
        Box box2 = box1.createSameBox();
        System.out.println(box1);
        System.out.println(box2);

        Box box3 = new Box(box1,box2);
        System.out.println(box3);
    }
}
