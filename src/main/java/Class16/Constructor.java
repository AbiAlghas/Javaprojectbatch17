package Class16;

public class Constructor {
     Constructor(String name){
        System.out.println("Static");
    }
// static belongs to class and instance belongs to objects
    public static void main(String[] args) {
        new Constructor("ABI");
    }
}
