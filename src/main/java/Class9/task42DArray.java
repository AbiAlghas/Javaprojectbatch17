package Class9;

public class task42DArray {
    public static void main(String[] args) {
        String [][] cars=
                {    {"Dodge",  "chev",  "Ford"},
                        {"BMW",   "Audi", "Porsche"},
                        {"Hyundai",  "KIa",  "Genesis"},
                        {"Ferrari",  "Lamb",   "Fiat"}};
        for(String[] r: cars){
            for(String c:r){
                System.out.print(c+" ");
            }
            System.out.println();
        }






        for (int row = 0; row < cars.length; row++)
            for (int col = 0; col < cars[row].length; col++) {
                System.out.print (cars[row][col]+" ");

            }
        System.out.println();

    }


}

