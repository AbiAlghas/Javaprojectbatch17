package Class11;

public class E2StringMethods {
    public static void main(String[] args) {
        String str="Batch 17 is A great.Just kidding.please don't take it seriously";
        //write a code that will count how many times the letter A has appeared
        int count=0;
        for (int i = 0; i <str.length() ; i++) {    //if= use then we have to do -1
           if(str.charAt(i)=='a'||str.charAt(i)=='A'){
               count++;
           }
                }
        System.out.println(count);
            }

        }



