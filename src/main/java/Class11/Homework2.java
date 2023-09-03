package Class11;

public class Homework2 {
    //You have a String a=”Is it saturday? Is it raining? Do we have a Java Class today?”
    // How would you find out how many sentences are in that String?
    //[2:53 PM]
    public static void main(String[] args) {
        String str ="Is it saturday? Is it raining? Do we have a Java Class today?";
        String [] strs=str.split("[?]");
        System.out.println(strs.length);


    }
}
