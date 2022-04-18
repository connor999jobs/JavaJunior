package knu.mit.Threads.Bank;

public class BancAcc {
    private int sum;
    private final Object monitor = new Object();

    public BancAcc(int sum) {
        this.sum = sum;
    }

    public void withDraw(String name, int sum){
        synchronized (monitor){
            System.out.println(name + " went to the ATM");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }

            if (sum <= this.sum){
                this.sum -= sum;
                System.out.println(name + " withdrew " + sum + " $" );
                System.out.println("Left " + this.sum);
            } else {
                System.out.println("You don't have enough sum, " +  name);
            }
        }
    }
}
