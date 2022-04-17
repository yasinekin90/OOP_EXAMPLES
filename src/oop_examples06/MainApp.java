package oop_examples06;

public class MainApp {
    public static void main(String[] args) {

        Shape3D shp1=new Shape3D(10,6,5);
        Shape3D shp2=new Shape3D();
       Box b1=new Box();
       Box b2=new Box(5,5,5,"red",10);

        System.out.println(shp1);//shp1 e atanan değerler atanır
        System.out.println(shp2);// varsayılan olarak parametresiz metotdaki değerler atanır
        System.out.println(b1);// her ne kadar Box ın string metodunu ezmediysek de varsayılan olarak ata sınıfının parametresiz değerlerini alır
        System.out.println(b2);


    }
}
