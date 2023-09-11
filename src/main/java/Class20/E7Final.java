package Class20;

public class E7Final {
    public static void main(String[] args) {
        final int age=10;
        //age=20;
        System.out.println(age);
    }
}
final class parent {
   final void marry(){
        System.out.println("Take our permission first");
    }
}
/*
class Child extends parent{
    void marry(){
        System.out.println("I want to marry someone else");*/

