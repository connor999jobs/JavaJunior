package knu.mit.oop.inheritance.hw2;

public class Triangle extends Figure{
    double c;
    public Triangle(double a, double b, double c) {
        super(a, b);
        this.c = c;
    }

    public Triangle(double size, double c){
        super(size,size);
        this.c = size;
    }

    @Override
    public double returnSquare() {
        double p = (getA() + getB())/2;
        double square = (p * (p - getA()) * (p - getB()) * (p - c));
        return Math.sqrt(square);

    }
}
