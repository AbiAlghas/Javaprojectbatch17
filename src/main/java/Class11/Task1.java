package Class11;
//create a string and if the string is not empty.perform the following
//if string has odd number of characters and has 3 or more characters.
//print the character in middle of string
//e.g String str=hello
public class Task1 {
    public static void main(String[] args) {
        String str="hello";
           if(str.length()%2!=0&&str.length()>=3){
               int middle=str.length()/2;
               System.out.println(str.charAt(middle));

           }

        }






    }
