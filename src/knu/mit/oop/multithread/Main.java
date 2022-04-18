package knu.mit.oop.multithread;

public class Main {
    public static boolean winner = false;
    public static void main(String[] args) {

       int rand = (int) (Math.random() * 100);
        System.out.println(rand);
        Thread timer = new Thread(new Runnable() {
            @Override
            public void run() {
                int i =0;
                try {
                    while (!winner){
                        System.out.println(i);
                        i++;
                        Thread.sleep(100);
                    }

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread player  = new Thread(new Runnable() {
            @Override
            public void run() {
                while (!winner){
                int guestNumber = (int) (Math.random() *100);
                if (guestNumber == rand) {
                    winner = true;
                    System.out.println(guestNumber);
                }
                }
            }
        });
        timer.start();
        player.start();
    }
}
