package Class11;
//splitting method on any character
public class E10StringMethods {
    public static void main(String[] args) {
      //  String str="HI#There#how#are#you";
        String str="HI There how are you";
        String[] strArr=str.split("\\s");
        System.out.println(strArr.length);
        System.out.println(strArr[1]);
    }
}
