package oop_examples03;

public class Point3D extends Point {
    private int z;



    public Point3D(int x, int y, int z){
        super(x,y);//constructor yapısı önce yazılmalı yoksa hata verir
        this.z=z;
    }
    public Point3D (){

    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }


}
