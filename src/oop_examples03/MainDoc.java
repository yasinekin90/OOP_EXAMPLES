package oop_examples03;

public class MainDoc {
    public static void main(String[] args) {
        Point p1=new Point(5,7);
        Point p2=new Point();


        Point p3=new Point();

        /*System.out.println(p1.getX());
        System.out.println(p3.getX());
        System.out.println(p2.getX());*/
      /*  Point[] points=new Point[100];
        for (int i = 0; i <points.length ; i++) {
            points[i]=new Point();
        }
            Point3D p9=new Point3D(3,4,5);*/
/*

        Animal anm1=new Animal();
        System.out.println();
        Animal anm2=new Animal(10,30,"cat");//içine this(type) yazdıgımız için tek parametreli constructorın içeriğide yazıldı
        System.out.println();
        Animal anm3=new Animal("cat");
*/
   Lion l1=new Lion();// atasınıfının içeriği ile birlikte çıktı verir
        Lion l2=new Lion();
        l2.setType("Big cat");


    }


}
