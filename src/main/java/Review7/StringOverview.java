package Review7;

public class StringOverview {
    public static void main(String[] args) {
        String phone="Iphone";
        String color=new String();      //second way of creating string
        color="Yellow";

        String day=new String("Thursday");
        String sentence="   Today is September 7    ";

        int size=sentence.length();    //to find out length
        System.out.println(size);
        System.out.println("+++++++++++++++++++++++++++++++");

        sentence=sentence.trim();
        System.out.println(sentence);  //cut the spaces in the beginning and in the end
        System.out.println("+++++++++++++++++++++++++++++++");

        String[] words=sentence.split(" ");   // give us the index word
        System.out.println(words[2]);
        System.out.println("+++++++++++++++++++++++++++++++");

        String modifiedNewString=sentence.replace("Today","Tomorrow"); // replace today with tomorrow
        System.out.println(modifiedNewString);
        System.out.println("+++++++++++++++++++++++++++++++");
        String str1="Hi Hi Friends";

        str1=str1.replace("Hi","Hello");
        System.out.println(str1);
        System.out.println("+++++++++++++++++++++++++++++++");

        str1=str1.replaceFirst("Hello","Bye");
        System.out.println(str1);
        System.out.println("+++++++++++++++++++++++++++++++++");

       char letter= str1.charAt(2);
        System.out.println(letter);
        System.out.println("+++++++++++++++++++++++++++++++++");

        int indexOfCharB=str1.indexOf('F');
        System.out.println(indexOfCharB);
        System.out.println("+++++++++++++++++++++++++++++++++");










    }
}
