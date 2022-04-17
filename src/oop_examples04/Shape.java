package oop_examples04;

public abstract class Shape {
    public void showInfo(){
        System.out.println("A geometrical shape has been created");
    }
    abstract double countArea();//public yazılmadıgı halde publictir
    abstract double countPerimeter();
    abstract void draw();
}
