package knu.mit.syntaxic.massive;

public class Space {
    public static void main(String[] args) {
        String [] month = {
                "Январь",
                "Февраль",
                "Март",
                "Апрель",
                "Май",
                "Июнь",
                "Июль",
                "Август",
                "Сентябрь",
                "Октябрь",
                "Ноябрь",
                "Декабрь"
        };
        String result = "";

        for (int i = 0; i < month.length; i++) {
            result +=month[i];
            if (i == month.length -1){
               result += ". ";
            } else {
                result += ", ";
            }

        }
        System.out.println(result);
    }
}
