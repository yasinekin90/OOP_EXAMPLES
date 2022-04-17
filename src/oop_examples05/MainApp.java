package oop_examples05;

public class MainApp {
    public static void main(String[] args)  {
        Personel p1=new Personel();
        System.out.println("Adı Soyadı: "+p1.getAdSoyad());
        System.out.println("Maaş:"+p1.getMaas());
        p1.setAdSoyad("Yasin Ekin");
        p1.setMaas(5000);
        p1.setSicilNo("145367");
        p1.basla();
        p1.bitir();
        p1.molaVer();
        Mudur m1=new Mudur();


    }
}
