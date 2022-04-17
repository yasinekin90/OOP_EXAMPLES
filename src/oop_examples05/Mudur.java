package oop_examples05;

public class Mudur extends Personel{

    private String gorevTuru;
    private boolean aktifGorevdeMi;
    private double makamTazminati;

    public Mudur(String adSoyad, String sicilNo, double maas, String gorevTuru, boolean aktifGorevdeMi, double makamTazminati) {
        super(adSoyad, sicilNo, maas);
        this.gorevTuru = gorevTuru;
        this.aktifGorevdeMi = aktifGorevdeMi;
        this.makamTazminati = makamTazminati;
    }

    public Mudur() {
        System.out.println("Müdür nesnesi oluşturuldu");
    }

    public String getGorevTuru() {
        return gorevTuru;
    }

    public void setGorevTuru(String gorevTuru) {
        this.gorevTuru = gorevTuru;
    }

    public boolean isAktifGorevdeMi() {
        return aktifGorevdeMi;
    }

    public void setAktifGorevdeMi(boolean aktifGorevdeMi) {
        this.aktifGorevdeMi = aktifGorevdeMi;
    }

    public double getMakamTazminati() {
        return makamTazminati;
    }

    public void setMakamTazminati(double makamTazminati) {
        this.makamTazminati = makamTazminati;
    }
}
