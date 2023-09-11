package Class19;

public class CreditCardTester {

    public static void main(String[] args) {
        CreditCard c1=new CreditCard();
        c1.callInterest(100);
        visa v=new visa();
        v.callInterest(250);
        AX a=new AX();
        a.callInterest(500);


    }
}
