package Class7;

public class TasKNsetedLoop1 {
    //1 2 3 4 5 6 (4 times)
    public static void main(String[] args) {
        int y=1;
        while(y<=4) {

            int x = 1;
            while (x <= 6) {
                System.out.print(x+" ");
                x++;
            }
            System.out.println();
            y++;


        }
    }
}