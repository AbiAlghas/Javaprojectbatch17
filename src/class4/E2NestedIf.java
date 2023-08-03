package class4;

public class E2NestedIf {
    public static void main(String[] args) {
        boolean winter = true;
        String jacketColour = "Black";
        if (winter == true) {
            System.out.println("its Very cold");

            if (jacketColour.equals("Red")) {
                System.out.println("lets go with red Nike shoes");


            }else{
                System.out.println("lets go with the blue ones");
            }

        }else {

            System.out.println("No need to wear jackets");


        }

    }
}
