package Replitpractice;

public class Replit106 {
    /*Instantiate and StringBuffer class
Append Value "Hello" to it
Append value "World" to it.
Print in UPPERCASE.
**Expected Output:**
HELLO WORLD
     */
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer();
        sb.append("hello");
        sb.append(" ");
        sb.append("world");
        String result=sb.toString().toUpperCase();
        System.out.println(result);




    }

}
