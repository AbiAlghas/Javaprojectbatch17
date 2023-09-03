package Class11;
//Split Method
//will use array
public class E8StringMethods {
    public static void main(String[] args) {
        String str="Hi there how are you.i am good. I am driving";
        String[]strs=str.split("[.]");
        System.out.println(strs.length);
        System.out.println(strs[2].trim()); // cut the extra space


    }
}
