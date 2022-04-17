package oop_examples03;

public class Animal {

    private int age;
    private int weight;
    private String type;

    public Animal(int age, int weight, String type) {
        this(type);// constructor oldugu için başta yazmak zorundayız
        this.age = age;
        this.weight = weight;

        System.out.println("üçlü constructor ile nesne oluşturuldu ");
    }

    public Animal(String type) {
        this.type = type;
        System.out.println("Tek parametreli constructor ile nesne oluşturuldu");
    }

    public Animal() {
        System.out.println("An animal object has been created");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
