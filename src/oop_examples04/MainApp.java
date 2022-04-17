package oop_examples04;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
         /*  Square sq1=new Square();
           Rectangle rq1=new Rectangle();
            sq1.setSide(5);
           sq1.showInfo();

        rq1.setSide1(3);
        rq1.setSide2(5);
        rq1.draw();
         rq1.bilgileriGoster();
         sq1.bilgileriGoster();*/
        Scanner input=new Scanner(System.in);
        System.out.println("Geometrical Shapes");
        System.out.println("1.Square");
        System.out.println("2.Rectangle");
        System.out.println("3.Circle");
        System.out.print("Choise:");
        int choise= input.nextInt();
        Shape shp=null;
        switch (choise){
            case 1:
                System.out.print("Side: ");
                shp=new Square(input.nextDouble());
                break;

            case 2:
                System.out.print("Side1: ");
                double side1=input.nextDouble();
                System.out.print("Side2: ");
                double side2=input.nextDouble();
                shp=new Rectangle(side1,side2);
                break;

            case 3:

                break;

            default:
                break;
        }


        shp.draw();
        System.out.println(shp);

    }
}
