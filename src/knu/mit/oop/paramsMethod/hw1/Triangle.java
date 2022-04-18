package knu.mit.oop.paramsMethod.hw1;

public class Triangle {
    double weight;
    double lenght;

    public Triangle(double weight, double lenght) {
        this.weight = weight;
        this.lenght = lenght;
    }

    double getPer(){
        return weight+lenght;
    }
    double getSquare(){
        return (weight*lenght) /2;
    }
}
