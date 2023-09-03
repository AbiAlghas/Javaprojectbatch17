package Replitpractice;

public class Replit98 {
    /* Create a String given="Hello Syntax friends".
Using String methods from given String create new String "Welcome Syntax family"
**Expected Output:**
Welcome Syntax family
     */

    public static void main(String[] args) {
        String given="Hello Syntax friends";
        String given1=(given.replace("Hello","Welcome").replace("friends","Family"));
        System.out.println(given1);

    }
}
