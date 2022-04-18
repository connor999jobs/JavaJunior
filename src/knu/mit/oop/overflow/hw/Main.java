package knu.mit.oop.overflow.hw;

public class Main {
    public static void main(String[] args) {
        Monstr monstr = new Monstr(2,4,6);
        Monstr monstr1 = new Monstr(2,4);
        Monstr monstr2 = new Monstr(2);
        Monstr monstr3 = new Monstr();

        monstr.voice();
        monstr1.voice(5);
        monstr2.voice(3,"GGGGG");

    }
}
