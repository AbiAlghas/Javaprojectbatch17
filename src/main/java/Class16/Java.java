package Class16;

public class Java {
    private String name;
    private int age;
    private double height;
    private char gender;
    private int salary;


    private Java() {

    }

    public Java(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    Java(String name, int age, double height, char gender) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.gender = gender;
    }

    protected Java(String name, int age, double height, char gender, int salary) {
        this(name, age, height);
        this.gender = gender;
        this.salary = salary;

    }

    public void printInfo() {
        System.out.println(this.name + " " + age + " " + height + " " + gender + " " + salary);
    }
}