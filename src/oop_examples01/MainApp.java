package oop_examples01;

public class MainApp {
    public static void main(String[] args) {
        Cars car1 = new Cars(); // Cars car1; seklinde tanımlanabilir ama bir nesne olusmaz.
        //Cars car1;  car1=new Cars(); seklinde ayrı ayrı tanımlanabilir.

       /* car1.setModelYili(2022);
        car1.setBrand("volkswagen ");

        System.out.println(car1.getModelYili());
        System.out.println(car1.getBrand());*/

       /* Personel person1=new Personel();
        person1.setName("Hakan");
        person1.setSurname("Taşıyan");

        Personel person2=new Personel();
        person2.setName("Mesut");
        person2.setSurname("Kalkan");
        person1.setAge(32);
        person1.setSalary(2500);

        person1.showInfo();

        person1.work();
        person2.signDocument();*/

        Square sq1=new Square();
        sq1.setSideLength(5);
        sq1.showInfo();


    }

}
