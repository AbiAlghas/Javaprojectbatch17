package Class8;

public class E12ContinueKeyword {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Batch 17 is Greatest of all time");
            if(i%2==0){
                continue;
            }
            System.out.println("i was kidding");
        }
    }
}
