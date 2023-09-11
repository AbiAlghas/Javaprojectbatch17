package Class19;

public class CreditCard {

    public void callInterest(double balance) {
        System.out.println(balance * 0.05);
    }
}
    class visa extends CreditCard{

    }
    class AX extends CreditCard{
        public void callInterest(double balance) {
            System.out.println(balance*0.07);

    }}


