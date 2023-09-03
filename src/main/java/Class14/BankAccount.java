package Class14;

public class BankAccount {
    private String name="Fahim";
    private String userName="Fahim123";
    private String Password="Pass123";
    private double accountBalance=-300;
    private String accountNumber="123456";

    private void printInfo(){
        System.out.println("Iam fahim from batch 17");
    }
    void printCity(){
        System.out.println("New yor" +
                "");
    }

    public static void main(String[] args) {
        BankAccount bankAccount=new BankAccount();
        System.out.println(bankAccount.name);
    }


}
