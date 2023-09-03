package Review4;

public class E2NeestedLoop {
    public static void main(String[] args) {

        for (int i = 0; i < 2; i++) {
            System.out.println("Hello");
            for (int j = 0; j < 1; j++) {
                System.out.println("Happy Birthday Fahim");
                for (int k = 0; k < 1; k++) {
                    System.out.println("Here is your gift");
                }

            }
        }
    }
}
