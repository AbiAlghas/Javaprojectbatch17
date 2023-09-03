package Class9;

public class Arrays2DHW4 {
    //Create 2D array of countries: north america countries, south america countries,
    // europe countries, asian countries, african countries. Then print all values from
    // that array using 2 different loops and calculate how many total countries been stored.
    public static void main(String[] args) {
        String[][] countries =
                       {{ "Canada", "Usa", "mexico"},
                        {"peru", "brazil", "argentina"},
                        {"Uk", "norway", "germany",},
                        {"pakistan", "india", "srilanka"},
                        {"egypt", "nigeria", "cake"}};


        for (String [] row:countries){
            for(String c:row){
                System.out.print(c+ " ");
            }
            System.out.println();
        }
        System.out.println("****************");

        int total=0;
        for (int i = 0; i <countries.length ; i++) {
            for (int j = 0; j <countries[i].length ; j++) {
                total++;
            }
            }
        System.out.println("Total number of countries " +total);
        }




    }

