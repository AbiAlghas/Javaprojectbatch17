package Class16;

public class PersonTester {
    public static void main(String[] args) {
        Person p1=new Person("Fahim",106,85,
                'M');
        p1.printInfo();

        Person p2=new Person("Mikhail",85,105,
                'M', 120000,"Bold");
        p2.printInfo();

        Person p3=new Person();
        p3.printInfo();

    }


}
