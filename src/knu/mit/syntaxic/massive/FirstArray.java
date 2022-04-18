package knu.mit.syntaxic.massive;

public class FirstArray {
    public static void main(String[] args) {

        int[] first = new int[900];
        for (int i = 0; i < first.length; i++) {
            first[i] = i + 100;
        }

        int [] second = new int[first.length];
        for (int i = 0, j = first.length -1; i< first.length; i++,j-- ){
            second[j] = first[i];
        }
        for (int i: second) {
            System.out.println(i);

        }

//        int[] daysInMonth = new int[12];
//        daysInMonth[0] = 31;
//        daysInMonth[1] = 28;
//        daysInMonth[2] = 31;
//        daysInMonth[3] = 30;
//        daysInMonth[4] = 31;
//        daysInMonth[5] = 30;
//        daysInMonth[6] = 31;
//        daysInMonth[7] = 31;
//        daysInMonth[8] = 30;
//        daysInMonth[9] = 31;
//        daysInMonth[10] = 30;
//        daysInMonth[11] = 31;
//        for (int i = 0; i < daysInMonth.length; i++) {
//            System.out.println(daysInMonth[i]);
//        }

//        int [] nums = new int[100];
//        for (int i = 0; i < nums.length; i++) {
//            nums[i] = i * 10;
//        }
//        for (int i = 0; i < nums.length; i++) {
//            System.out.println(nums[i]);
//        }

//        int[] first = new int[900];
//        for (int i = 0; i < first.length; i++) {
//            first[i] = i + 100;
//        }
//        int[] second = new int[first.length];
//        for (int i = 0, j = first.length - 1; i < first.length; i++, j--) {
//            second[j] = first[i];
//        }
//        for (int i : second) {
//            System.out.println(i);
//        }
    }
}
