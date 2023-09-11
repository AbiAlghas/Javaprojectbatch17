package Class18;

class Grandpa{
    String color="White";
}
public class Furniture extends Grandpa {
    String color="Black";

}
class Chair extends Furniture{
   String color="Brown";
    void printColor(){
       String color="Blue";
        System.out.println(color);
      System.out.println(super.color);
        System.out.println(this.color);
    }
}
class FurnitureTester{
    public static void main(String[] args) {
        Chair chair=new Chair();
        chair.printColor();
    }
}