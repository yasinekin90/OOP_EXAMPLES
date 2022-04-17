package oop_examples04;

public class Circle extends Shape {
  private double r;
  final private double pi=Math.PI;
    public Circle() {
    }

    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    double countArea() {
        return pi*r*r;
    }

    @Override
    double countPerimeter() {
        return 2*pi*r;
    }

    @Override
    void draw() {
        System.out.println("A circle has been created");
    }
}
