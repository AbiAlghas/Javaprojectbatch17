package Class18;

public class CarTester {
    public static void main(String[] args) {
        BMW i8=new BMW("BMW","I8",80000,"BLACK");
        i8.printInfo();

        Audi R8=new Audi("Audi","R8",60000,"BLACK",true);
        R8.printInfo();
    }
}
