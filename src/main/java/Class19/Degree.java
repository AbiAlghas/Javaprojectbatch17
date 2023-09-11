package Class19;

public class Degree {
    public void getPrerequisite() {
        System.out.println("To get a degree you need high school diploma");
    }
}
    class Bachelors extends Degree {
        }
        class Masters extends Degree {

            public void getPrerequisite() {
                System.out.println("You need a Bachelors degree for the master");
            }}



