package knu.mit.Threads.ConCurrency;


public class Main {

//    private static final int SIZE = 10_000_000;
//    private static final int HALF = SIZE /2;
//
//
//    private static void startTimer(){
//        Thread timer = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                int seconds = 0;
//                try {
//                    while (true){
//                        System.out.println(seconds++);
//                        Thread.sleep(1000);
//                    }
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        });
//        timer.setDaemon(true);
//        timer.start();
//    }
//    public static void main(String[] args) {
//        withCunCurrency();
//        withoutConCurrency();
//
//
//    }
//
//    private static void withoutConCurrency(){
//        float[] array =new float[SIZE];
//        for (int i = 0; i <SIZE; i++){
//            array[i] = 1f;
//         }
//        long before = System.currentTimeMillis();
//        for (int i = 0; i < SIZE; i++) {
//            float f = (float) i;
//            array[i] = (float) (array[i] * Math.sin(0.2f + f / 5) * Math.cos(0.2f + f / 5) * Math.cos(0.4f + f / 2));
//        }
//        long after = System.currentTimeMillis();
//        System.out.println("withoutConCurrency: " + (after - before));
//    }
//
//
//    private static void withCunCurrency(){
//        float[] array =new float[SIZE];
//        for (int i = 0; i <SIZE; i++){
//            array[i] = 1f;
//        }
//        long before = System.currentTimeMillis();
//
//        float[] firstHalf = new float[HALF];
//        float[] secondHalf = new float[HALF];
//        System.arraycopy(array,0,firstHalf,0,HALF);
//        System.arraycopy(array,HALF,secondHalf,0,HALF);
//        Thread thread1 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < HALF; i++) {
//                    float f = (float) i;
//                    array[i] = (float) (array[i] * Math.sin(0.2f + f / 5) * Math.cos(0.2f + f / 5) * Math.cos(0.4f + f / 2));
//                }
//            }
//        });
//
//        Thread thread2 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < HALF; i++) {
//                    float f = (float) i;
//                    array[i] = (float) (array[i] * Math.sin(0.2f + f / 5) * Math.cos(0.2f + f / 5) * Math.cos(0.4f + f / 2));
//                }
//            }
//        });
//
//        thread1.start();
//        thread2.start();
//        try {
//            thread1.join();
//            thread2.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.arraycopy(firstHalf,0,array,0,HALF);
//        System.arraycopy(secondHalf,0,array,HALF,HALF);
//
//        long after = System.currentTimeMillis();
//        System.out.println("withConCurrency: " + (after - before));
//    }

    public static void main(String[] args) {
        Counter counter = new Counter();
        int barrier = 100_000_000;
        long before = System.currentTimeMillis();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < barrier; i++) {
                    counter.increment();
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < barrier; i++) {
                    counter.decrement();
                }
            }
        });

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < barrier; i++) {
                    counter.increment2();
                }
            }
        });

        Thread thread4 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < barrier; i++) {
                    counter.decrement2();
                }
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        try {
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(counter.getValue());
        System.out.println(counter.getValue2());

        long after = System.currentTimeMillis();
        System.out.println(after - before);
    }
}
