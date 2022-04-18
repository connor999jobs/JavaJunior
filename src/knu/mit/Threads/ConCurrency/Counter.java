package knu.mit.Threads.ConCurrency;

    public class Counter {
    private int value;
//    private Object monitor = new Object();
    private int value2;
    private Object monitor1 = new Object();
    private Object monitor2 = new Object();



    public   void increment(){
        synchronized (monitor1) {
            value++;
        }
    }
    public   void decrement(){
        synchronized (monitor1) {
            value--;
        }
    }
    public int getValue() {
        return value;
    }


    public   void increment2(){
        synchronized (monitor2) {
            value2++;
        }
        }
    public   void decrement2(){
        synchronized (monitor2) {
            value2--;
        }
        }
    public int getValue2() {
            return value2;
        }

}
