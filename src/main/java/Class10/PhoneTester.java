package Class10;

public class PhoneTester {
    public static void main(String[] args) {
        Phone IphoneObj = new Phone();
        IphoneObj.name = "Iphone";
        IphoneObj.price = 1400.65;
        IphoneObj.model = "14";

        System.out.println(IphoneObj.name);
        System.out.println(IphoneObj.price);
        System.out.println(IphoneObj.model);

        IphoneObj.memory();
        IphoneObj.features();
        IphoneObj.feature();




    }
}


