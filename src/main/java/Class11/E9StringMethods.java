package Class11;

public class E9StringMethods {
    public static void main(String[] args) {
        String str="Hi there how are you.i am good. I am driving";
        String[]strs=str.split("[.\\s]");
        System.out.println(strs.length);
       System.out.println(strs[4]);
       for(String s:strs){
           System.out.print(s+" ");
       }
    }
}
