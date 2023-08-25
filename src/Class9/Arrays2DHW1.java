package Class9;

public class Arrays2DHW1 {
   //sing 2D array create a grocery list.
    //Inside you should have an array of veggies, fruits, dairy and sweets.
    // Retrieve all values from that array using 2 different loops
    public static void main(String[] args) {
        String[][] grocery =
                {{"onion", "tomato", "carrot", "chillies"},
                        {"Apple", "Banana", "grapes", "cherries"},
                        {"cheese", "milk", "yogurt", "cream"},
                        {"candy", "chocolate", "cake", "Pie"}};
        for (String[] r : grocery) {
            for (String c : r) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
        System.out.println("=========================");
        for (int row = 0; row < grocery.length; row++) {
            for (int col = 0; col < grocery[row].length; col++) {
                System.out.print(grocery[row][col] + " ");
            }
            System.out.println();

        }

    }

}



