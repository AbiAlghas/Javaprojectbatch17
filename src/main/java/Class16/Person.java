package Class16;

public class Person {
    private String name;
    private int age;
    private double weight;
    private char gender;
    private int salary;
    private String hairColor;

// if you put void it will be method not constructor
    //if we have same name for instance and local variable then java will always prefer local variable.
//we use this word when there is confusion
    //better to create multiple constructors to give more option to users
public Person (){

}
    public Person (String name,int age,double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Person (String name,int age,double weight,char gender){
        this.name=name;
        this.age=age;
        this.weight=weight;
        this.gender=gender;

    }
    public Person (String name,int age,double weight,char gender,int salary,String hairColor) {
        /*this.name = name;
        this.age = age;
        this.weight = weight;
        this.gender = gender;*/
        this(name,age,weight,gender); //this will always be first line
        this.salary = salary;
        this.hairColor = hairColor;
    }
    public void printInfo(){
        //String name="GIU";
        System.out.println(this.name+" "+age+" "+weight+" "+gender+" "+salary+" "+hairColor);
        ;
    }


}
