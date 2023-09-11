package Class18;

public class Bird {
    //Create a Bird class create 4 fields and use the
    //Bird class as parent class and create 2 classes
    //Using it one sparrow and one parrot use constructors
    // make fields private and define printInfo methods as well create the object of each class and call the methods

    private String name;
    private String breed;
    private int age;
    private String color;

    public Bird(String name,String breed,int age,String color) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.color = color;
    }
        void printInfo(){
            System.out.println("Bird name: "+name+"\n"+"Bird breed: "+breed+"\n"+"Bird age: "+age+"\n"+"Bird color:"+color);}
        }
        class sparrow extends Bird{
    public sparrow(String name,String breed,int age,String color){
        super(name, breed, age, color);
    }

    }
class parrot extends Bird {
    public parrot(String name, String breed, int age, String color) {
        super(name, breed, age, color);
    }

}