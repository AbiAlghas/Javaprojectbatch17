package Class11;

public class E6StringMethods {
   //when trying to replace all things
    public static void main(String[] args) {
        String str="ksdnfjAZSX232984!@#$%^AS";
        System.out.println(str.replaceAll("[A-Z]","="));
        System.out.println(str.replaceAll("[A-C]","="));
        System.out.println(str.replaceAll("[a-z]","="));
        System.out.println(str.replaceAll("[0-9]","="));
        System.out.println(str.replaceAll("[0-9]",""));
        System.out.println(str.replaceAll("[A-z]"," "));
        System.out.println(str.replaceAll("[&-;]"," "));



    }
}
