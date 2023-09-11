package Class17;

public class TeacherTester {
    public static void main(String[] args) {
        Teacher t1=new Teacher();
        t1.Name="Ayesha";
        t1.Subject="Urdu";
        System.out.println(t1.Name);
        System.out.println(t1.Subject);
        t1.teach();
        t1.grade();
        t1.talk();t1.eat();

        System.out.println("*****************");


        MathTeacher m1=new MathTeacher();
        m1.Name="Abi";
        m1.Subject="pashto";
        System.out.println(m1.Name);
        System.out.println(m1.Subject);
        m1.teach();
        m1.grade();
        m1.talk();
        m1.eat();

        System.out.println("*****************");


        ChemistryTeacher c1=new ChemistryTeacher();
        c1.Name="Mark";
        c1.Subject="chemistry";
        System.out.println(c1.Name);
        System.out.println(c1.Subject);
        c1.teach();
        c1.grade();
        c1.talk();
        c1.eat();

        System.out.println("*****************");







    }
}
