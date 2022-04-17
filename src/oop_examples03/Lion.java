package oop_examples03;

public class Lion extends Animal{
    private int form;
    public Lion(int age,int weight,String type,int form) {
        super(age,weight,type);
        this.form=form;
        System.out.println("A lion object has been created");
    }

    public Lion() {

    }

    public int getForm() {
        return form;
    }

    public void setForm(int form) {
        this.form = form;
    }
}
