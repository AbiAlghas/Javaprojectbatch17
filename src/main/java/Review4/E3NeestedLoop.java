package Review4;

public class E3NeestedLoop {
    public static void main(String[] args) {
        for (int i = 0; i <5 ; i++) {
            for (int j = i; j <=3 ; j++) {
                System.out.println(i+" "+j);
            }
        }
    }
}
