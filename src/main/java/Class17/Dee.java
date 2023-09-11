package Class17;

public class Dee {
    static String name="Abi";
    static void F(){
        System.out.println("f");
    }
}
class Eff extends Dee{
    public static void main(String[] args) {
        F();
        System.out.println(name);
    }
}
