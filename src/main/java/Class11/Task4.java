package Class11;

public class Task4 {
    //create a string that hold a sentence.
    //write a program to get new string without any spaces
    public static void main(String[] args) {
        String str="Hi there how      are you.i          am good. I am            driving";

        System.out.println(str.replaceAll(" ",""));

    }
}
