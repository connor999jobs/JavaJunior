package knu.mit.syntaxic.floatDouble;

public class Pifagor {
    public static void main(String[] args) {
        double a = 6;
        double b = 8;
        double c = 10;

        double catets = Math.pow(a,2) + Math.pow(b,2);
        double gipotenusa = Math.pow(c,2);
        if (catets == gipotenusa){
            System.out.println("Треугольник прямоугольный");
        }
        else {
            System.out.println("Треугольник не прямоугольный");
        }
    }
}
