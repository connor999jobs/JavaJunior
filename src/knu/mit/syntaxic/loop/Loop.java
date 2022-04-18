package knu.mit.syntaxic.loop;

public class Loop {
    public static void main(String[] args) {
//      int sum = 0;
//      int count = 1;
//      while (count <= 100){
//          sum +=count;
//          count++;
//      }
//      float result = sum/ (float)count;
//        System.out.println(result);


//        int a = 0;
//        do {
//            System.out.println("hello");
//        }
//        while (a >0);


        for (int i = 100; i <=1000; i++) {
//            if (i % 5 == 0)
            if (i %2 ==1 && i%5 ==0){
                System.out.println(i);
            }

        }
       }
    }

