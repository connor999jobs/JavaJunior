package knu.mit.jUnit.cw1;

public class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int delete(int a, int b) {
        return a - b;
    }

    int mult(int a, int b) {
        return a * b;
    }

    int div(int a, int b) {
        int c = 0;
        try {
            c = a /b;
        } catch (ArithmeticException e){
            System.out.println("error div 0");
        }
        return c;
    }
}
