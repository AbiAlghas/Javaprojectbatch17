package Review7;

public class SuperHeroes {
    String name,power;
    int age;
    char gender;
    SuperHeroes(String name,String power){
        this.name=name;
        this.power=power;
    }
    SuperHeroes(String name,String power,int age){
        this(name,power); //this() making a call to the current class constructor
        this.age=age;     // this. accessing current class instance variables
    }
    public static void main(String[] args) {
        SuperHeroes sh=new SuperHeroes("Superman","Fly",25);
        System.out.println(sh.name);
        System.out.println(sh.power);
        System.out.println(sh.age);
        System.out.println("*********");
        SuperHeroes sh1=new SuperHeroes("Batman","Money",20);
        System.out.println(sh1.name);
        System.out.println(sh1.power);
        System.out.println(sh1.age);



    }

}
