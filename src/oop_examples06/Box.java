package oop_examples06;

public class Box extends Shape3D {

    private String color;
    private double weight;

    public Box(double depth, double height, double width, String color, double weight) {
        super(depth, height, width);
        this.color = color;
        this.weight = weight;
    }

    public Box() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return String.format("[Weight:%5.2f,Volume:%5.2f]",weight,countVolume());
    }
}
