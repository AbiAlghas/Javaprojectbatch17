package Class7;

public class ArraysHW2 {
    /*Create an array of names and store all names of your group.
    Then print your name from that array. (use 2 different ways of creating an array).
     */
    public static void main(String[] args) {
        String [] names={"Arfan","Ehab","Abi","Ayesha","Jamel"};
        System.out.println(names);
        System.out.println(names[2]);

        String [] names1=new String[5];
        names1[0]="Arfan";
        names1[1]="Ehab";
        names1[2]="Abi";
        names1[3]="Ayesha";
        names1[3]="Jamel";
        System.out.println(names1[2]);



    }
}
