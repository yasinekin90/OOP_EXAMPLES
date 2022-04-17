package oop_examples04;

public class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public Square() {
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    double countArea() {
        return side*side;
    }

    @Override
    double countPerimeter() {
        return 4*side;
    }


    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println();
        System.out.printf("Kenar : %5.2f\tÇevre : %5.2f\tAlan : %5.2f",side,countPerimeter(),countArea());
    }

    @Override
    void draw() {
        System.out.println();
        for (int i = 0; i <side ; i++) {
            for (int j = 0; j <side ; j++) {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
        }

    }
    public void bilgileriGoster(){
        System.out.println();
        System.out.printf("Kenar : %5.2f\tÇevre : %5.2f\tAlan : %5.2f",side,countPerimeter(),countArea());
    }

    @Override
    public String toString() {
        return String.format("Kenar : %5.2f\tÇevre : %5.2f\tAlan : %5.2f",side,countPerimeter(),countArea());
    }
}
