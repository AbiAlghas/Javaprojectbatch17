package Class11;

public class E1StringMethods {
    public static void main(String[] args) {
        String str="Batch 17 is great.";
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(4));
        int length=str.length(); // will give us total number of elements
        System.out.println(length);
        System.out.println(str.charAt(str.length()-1)); //should use this method
        System.out.println("***************************");
        int lastIndex=str.length()-1;
        System.out.println(lastIndex);
        char c=str.charAt(lastIndex);
        System.out.println(c);


    }
}
