package oop_examples01;

public class Personel {
    private String name;
    private String surname;
    private int age;
    private double salary;

     public void setName(String name){
         this.name=name;
     }
     public String getName(){
         return name;
     }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void work(){
        System.out.println(this.name+" is working");
    }

    public void signDocument(){
        System.out.println(this.name+" is signing the documents");
    }
    public void showInfo(){

        System.out.println("Name:"+this.name);
        System.out.println("Surname:"+this.surname);
        System.out.println("Age:"+this.age);
        System.out.println("Salary:"+this.salary);
    }
}
