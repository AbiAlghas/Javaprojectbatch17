package Class18;

public class Car {
   private String make;
    private String model;
    private double price;
    private String color;

    public Car(){

    }

    public Car(String make,String model,double price,String color){
        this.make=make;
        this.model=model;
        this.price=price;
        this.color=color;

    }
    void printInfo(){
        System.out.println(make+" "+model+" "+price+" "+color);
    }
}
class BMW extends Car{
    //calling the constructor from parent class
    public BMW(String make,String model,double price,String color){
        super(make, model, price, color);

    }

}
class Audi extends Car{
    boolean sunRoof;
    public Audi(String make,String model,double price,String color,Boolean sunRoof) {
    super(make, model, price, color);
    this.sunRoof=sunRoof;
    }}
