package Class17;

import Class18.Bike;

public class HondaBike extends Bike {
    void printModel(){
        System.out.println(make);
    }
}
class Tester{
    public static void main(String[] args) {
        HondaBike hb=new HondaBike();

    }
}
