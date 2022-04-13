package oop_examples02;

public class Rectangle {
    private int uzunKenar,kisaKenar;
    private String name;

    public Rectangle(String name,int uzunKenar, int kisaKenar) {
        this.uzunKenar = uzunKenar;
        this.kisaKenar = kisaKenar;
        this.name=name;
    }

    public Rectangle() {
    }

    public int getUzunKenar() {
        return uzunKenar;
    }

    public void setUzunKenar(int uzunKenar) {
        this.uzunKenar = uzunKenar;
    }

    public int getKisaKenar() {
        return kisaKenar;
    }

    public void setKisaKenar(int kisaKenar) {
        this.kisaKenar = kisaKenar;
    }
    public int alanHesapla(){
        return uzunKenar*kisaKenar;
    }
    public int cevreHesapla(){
        return 2*(uzunKenar+kisaKenar);
    }
    public void showInfo(){
        System.out.println("Rectangle name: "+this.name);
        System.out.println("ALAN: "+alanHesapla());
        System.out.println("ÇEVRE: "+cevreHesapla());
    }


}
