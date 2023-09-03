package Class11;
//when want to remove specif range
public class E7StringMethods {
    public static void main(String[] args) {
        String str="ksdnfjAZSX2326984!@#$%^AS";

        System.out.println(str.replaceAll("[A-Z0-9]"," "));
        System.out.println(str.replaceAll("[A-Z0-58-9a-j]"," "));
        System.out.println(str.replaceAll("[ks2S]"," "));
        System.out.println(str.replaceAll("\\d"," "));   //all the digits
        System.out.println(str.replaceAll("\\s"," "));
        System.out.println(str.replaceAll("[^A-Z]"," ")); //remove everything except all capital letters
        System.out.println(str.replaceAll("[^A-Za-z0-9]"," ")); //remove special character




    }
}
