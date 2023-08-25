package Review5;

public class TwoDArray1 {
    public static void main(String[] args) {

        int[][] array=new int [2][4];
        array[0][0]=12;
        array[0][1]=13;
        array[0][2]=14;
        array[0][3]=15;
        //2 row
        array[1][0]=1;
        array[1][1]=2;
        array[1][2]=3;
        array[1][3]=4;
        System.out.println(array[0][3]);//15

        //how to get all elements from array?
        // array.length in 2D array returns number of rows
        //array[row].length in 2D array returns number of column from that row
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length ; j++) {
                System.out.print(array[i][j]+" ");
                
            }
            System.out.println();
        }
        



    }
}
