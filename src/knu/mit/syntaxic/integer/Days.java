package knu.mit.syntaxic.integer;

public class Days {
    public static void main(String[] args) {
        int days = 5000;
        int years = days /365;
        int mounth = (days % 365) / 31;
        int leftDays = days - years * 365 - mounth *31;
        System.out.println("Общее количество дней = " + days);
        System.out.println("Общее количество лет = " + years);
        System.out.println("Общее количество месяцев = " + mounth);
        System.out.println("Days =" + leftDays);

    }
}
