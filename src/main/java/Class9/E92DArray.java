package Class9;

import java.util.Arrays;

public class E92DArray {
    public static void main(String[] args) {
        String [][] names=
                {       {"Hind",  "Mikhail",  "Ismael",   "Ahmed"},
                        {"John",   "Bob",        "Adam",  "Tamim"},
                        {"Joke",  "Laugh",  "John Ahmed","Muhammad"},
                        {"Gui",  "Backend",    "Front",      "API"}
                };
                       for(String [] row:names) {
                           for (String v : row) {
                               System.out.print(v + " ");

                           }
                           System.out.println();

                       }
        System.out.println(Arrays.deepToString(names));   //for printing 2DArrays

    }
}
