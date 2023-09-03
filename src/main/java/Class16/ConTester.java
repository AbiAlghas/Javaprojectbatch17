package Class16;

public class ConTester {
    private ConTester(){
        System.out.println("Private");

    }
     ConTester(String name) {
         System.out.println("Default");}
    protected ConTester(int age ) {
        System.out.println("protected");}
    public ConTester(double weight){
        System.out.println("Public");}


    public static void main(String[] args) {
        new ConTester();
        new ConTester("abida");
        new ConTester(1652);
        new ConTester(10.25);

    }
        }

