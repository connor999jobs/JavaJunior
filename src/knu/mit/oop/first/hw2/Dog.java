package knu.mit.oop.first.hw2;

public class Dog {
    String name;
    String breed;
    int speed;

    void run(){
        for (int i = 1; i <= speed ; i++) {
            System.out.println("Run Run");
            i++;
        }
    }

    String info(){
        return "Name: " + name + "\n Breed: " + breed + "\n Speed: " +speed ;
    }
}
