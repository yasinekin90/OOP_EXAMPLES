package oop_examples01;

public class Square {
    private int sideLength;

    public int getSideLength() {
        return sideLength;
    }

    public void setSideLength(int sideLength) {
        this.sideLength = sideLength;
    }

    public int countPerimeter(){


        return 4*sideLength;
    }
    public int countField(){

        return sideLength*sideLength;
    }
    public void showInfo(){
        System.out.println("The perimeter of square is "+this.countPerimeter());
        System.out.println("The field of square is "+this.countField());
    }
}
