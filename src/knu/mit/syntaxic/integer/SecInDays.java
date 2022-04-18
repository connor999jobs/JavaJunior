package knu.mit.syntaxic.integer;

// Создать новый класс в котором вводится количство секнд а программа выводит в консоль сколько это дней часов минут и секунд
public class SecInDays {
    public static void main(String[] args) {
        int someSecond = 512000;

        int secondsInMinutes = 60;
        int secondsInHours = secondsInMinutes * 60;
        int secondsInDays = secondsInHours * 24;

        //Сохраним сколько секунд в минутах, сколько секунд в часах и сколько секунд в сутках, для дальнейших вычислений

        int days = someSecond / secondsInDays;

        //Вычисляем количество часов - берем остаток от деления (из предыдущего действия) и делим его на количество секунд в часах

        int hours = (someSecond % secondsInDays) / secondsInHours;

        //Вычисляем количество минут - берем остаток от деления (из предыдущего действия) и делим его  на количество секунд в минутах
        int seconds = ((someSecond % secondsInDays) % secondsInHours) / secondsInMinutes;

        System.out.println("Общее количество секунд = " + someSecond);
        System.out.println("Дни = " + days);
        System.out.println("Часы = " + hours);
        System.out.println("Секунды =" + seconds);

    }
}
