package oop_examples04;

public class Rectangle extends Shape{
    private double side1,side2;

    public Rectangle(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    public Rectangle() {
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    @Override
    double countArea() {
        return side1*side2;
    }

    @Override
    double countPerimeter() {
        return 2*(side1+side2);
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.printf("Kısa Kenar : %5.2f\tUzun Kenar : %5.2f\tÇevre : %5.2f\tAlan : %5.2f",side1,side2,countPerimeter(),countArea());
    }

    @Override
    void draw() {
        System.out.println();
        for (int i = 0; i <side1 ; i++) {
            for (int j = 0; j <side2 ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


    }

    public void bilgileriGoster(){
        System.out.printf("Kısa Kenar : %5.2f\tUzun Kenar : %5.2f\tÇevre : %5.2f\tAlan : %5.2f",side1,side2,countPerimeter(),countArea());
    }

    @Override
    public String toString() {
        return String.format("Kenar 1: %5.2f\tKenar 2:%5.2f\tÇevre : %5.2f\tAlan : %5.2f",side1,side2,countPerimeter(),countArea());
    }
}
