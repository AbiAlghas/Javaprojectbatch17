package Class11;

public class Homework1 {
    //Create a String that should be combination of letters, numbers and special characters.
    // Find out how many Alphabets(abd AZ) characters are there in the String.
    public static void main(String[] args) {
        String str = "AZSX232984!@#$%^sda";
        char [] charArray= str.toCharArray();
        int uppercase=0;
        int lowercase=0;
        for(char c:str.toCharArray()){
            if(Character.isUpperCase(c)){
                uppercase++;
            }else if (Character.isLowerCase(c)){
                lowercase++;
            }
        }


        System.out.println("The amount of upper case letter are  "+uppercase);
        System.out.println("The amount of lower case letter are "+lowercase);




    }
}
