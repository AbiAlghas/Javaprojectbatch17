package Class16;

public class Cat {
    private String name;
    private int age;
    private double weight;
    private String color;
    private String breed;
    private char gender;

    public Cat (String name,int age,double weight){
        this.name=name;
        this.age=age;
        this.weight=weight;
    }

    public Cat (String name,int age,double weight,String color,String breed,char gender){
        this(name,age,weight);
        this.color=color;
        this.breed=breed;
        this.gender=gender;


    }
    public void printInfo(){
        System.out.println(this.name+" "+age+" "+weight+" "+color+" "+breed+" "+gender);
    }


}
