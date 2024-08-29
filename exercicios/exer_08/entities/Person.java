package exercicios.exer_08.entities;

public class Person {
    private double width;
    private String name;
    private int age;

    public Person(double width, String name, int age) {
        this.width = width;
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
