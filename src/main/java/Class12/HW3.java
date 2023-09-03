package Class12;

public class HW3 {
   //Create a method that will print whether given String is palindrome or not.
   String palindrome(String word){
       String reverse="";
       for (int i = word.length()-1; i >=0 ; i--) {
           reverse=reverse+word.charAt(i);
       }
       if(word.equals(reverse)){
           return word + "  is  a palindrome";
       }else{
           return word + "  is not a palindrome";
       }
   }

    }
