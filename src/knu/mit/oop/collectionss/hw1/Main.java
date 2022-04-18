package knu.mit.oop.collectionss.hw1;

public class Main {
    public static void main(String[] args) {
        String man = "Это Иван, ему 34, его рост 166.3. Должность - Программист";
        String name = man.substring(4,8);
        String ageS = man.substring(14,16);
        int age = Integer.parseInt(ageS);
        String heightS = man.substring(27,32);
        double height = Double.parseDouble(heightS);
        String possition = man.substring(46,57);

        Man person = new Man(name,age,height,possition);
        System.out.println("Name: " + person.getName() + "\nAge: " + person.getAge() + "\nHeight: "
                + person.getHeight() + " cm\nPossiton: " + person.getPossition());
    }
}
