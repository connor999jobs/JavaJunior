package knu.mit.oop.returnObject.hw1;

public class Box {
    double weight;
    double height;
    double lenght;

    public Box(double weight, double height, double lenght) {
        this.weight = weight;
        this.height = height;
        this.lenght = lenght;
    }

    public Box(Box box, Box box1) {
        this.weight = box.weight + box1.weight;
        this.height = box.height + box.height;
        this.lenght = box.lenght + box.lenght;
    }


    Box createSameBox(){
        Box box = new Box(weight,height,lenght);
        return box;
    }



    @Override
    public String toString() {
        return "Box{" +
                "weight=" + weight +
                ", height=" + height +
                ", lenght=" + lenght +
                '}';
    }
}
