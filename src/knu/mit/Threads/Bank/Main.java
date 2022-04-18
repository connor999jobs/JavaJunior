package knu.mit.Threads.Bank;

public class Main {
    public static void main(String[] args) {
        BancAcc bancAcc = new BancAcc(1000);

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                bancAcc.withDraw("Max", 300);
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                bancAcc.withDraw("John", 500);
            }
        });

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                bancAcc.withDraw("Nick", 400);
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
