package knu.mit.oop.overflow.hw;

public class Monstr {
    int eye;
    int hands;
    int legs;

    public Monstr(int eye, int hands, int legs) {
        this.eye = eye;
        this.hands = hands;
        this.legs = legs;
    }

    public Monstr() {
    }

    public Monstr(int eye, int hands) {
        this.eye = eye;
        this.hands = hands;
    }

    public Monstr(int eye) {
        this.eye = eye;
    }

    public void voice(){
        System.out.println("GGGGWAAAAAAAA");
    }

    public void voice(int a){
        for (int i = 0; i < a; i++) {
            System.out.println("GGGGWAAAAAAAA");
            i++;

        }
    }

    public void voice(int a, String word){
        for (int i = 0; i <= a; i++) {
            System.out.println(word);

        }
    }
}
