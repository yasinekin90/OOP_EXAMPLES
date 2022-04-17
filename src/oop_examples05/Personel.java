package oop_examples05;

public class Personel {

    private String adSoyad;
    private String sicilNo;
    private double maas;

    public Personel(String adSoyad,String sicilNo,double maas){
        this.adSoyad=adSoyad;
        this.sicilNo=sicilNo;
        this.maas=maas;
        System.out.println("Personel nesnesi parametreli constructor ile oluşturuldu");
    }
    public Personel(){

    }

    public String getSicilNo() {
        return sicilNo;
    }

    public void setSicilNo(String sicilNo) {
        this.sicilNo = sicilNo;
    }

    public double getMaas() {
        return maas;
    }

    public void setMaas(double maas) {
        this.maas = maas;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public void basla(){
        System.out.println("Personel işe başladı");
    }
    public void bitir(){
        System.out.println("Personel işi bitirdi");
    }

    public void molaVer(){
        System.out.println("Personel mola verdi");
    }

}
