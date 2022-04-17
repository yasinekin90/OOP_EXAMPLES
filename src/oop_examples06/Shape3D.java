package oop_examples06;

public class Shape3D {
    private double depth;
    private double height;
    private double width;

    public Shape3D(double depth, double height, double width) {
        this.depth = depth;
        this.height = height;
        this.width = width;
    }

    public Shape3D() {  // ilk şekil olusturuldgunda varsayılan deger olarak 1,1,1 hacminde bir nesne olusturuldu
                        //baslangıcta sekilin hacmi 0,0,0 olmayacagı için bunu yaptık
        this(1.0,1.0,1.0);
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double countVolume(){
        return depth*height*width;
    }

    @Override
    public String toString() {
        return String.format("(%5.2fx%5.2fx%5.2f)",depth,height,width);
    }
}
