package oop_examples01;

public class Cars {
    private String color;
    private String model;
    private String brand;
    private double silindirHacmi;
   private int modelYili;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getSilindirHacmi() {
        return silindirHacmi;
    }

    public void setSilindirHacmi(double silindirHacmi) {
        this.silindirHacmi = silindirHacmi;
    }

    public int getModelYili() {
        return modelYili;
    }

    public void setModelYili(int modelYili) {
        if(modelYili>0){
            this.modelYili = modelYili;
        }

    }

}
