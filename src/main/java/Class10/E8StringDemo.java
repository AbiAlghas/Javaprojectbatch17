package Class10;

public class E8StringDemo {
    //check the start and end letters
    public static void main(String[] args) {
        String str="Today is a java class";
        System.out.println(str.startsWith("T"));
        System.out.println(str.startsWith("Today"));
        System.out.println(str.endsWith("s"));
        System.out.println(str.endsWith("Class"));

    }
}
