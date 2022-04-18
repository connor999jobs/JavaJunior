package knu.mit.oop.multithread;

public class RunnableTimer implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);

        }
    }
}
