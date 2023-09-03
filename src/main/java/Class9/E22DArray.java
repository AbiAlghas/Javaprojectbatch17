package Class9;

public class E22DArray {
    public static void main(String[] args) {
        String [][] names=
                {       {"Hind",  "Mikhail",  "Ismael",   "Ahmed"},
                        {"John",   "Bob",        "Adam",  "Tamim"},
                        {"Joke",  "Laugh",  "John Ahmed","Muhammad"},
                        {"Gui",  "Backend",    "Front",      "API"}
                };
      String[] Row=names[2];
       // System.out.println(Row[0]);
       // System.out.println(Arrays.toString(Row));
        for(String name:Row){
            System.out.println(name);

        }
    }
}
