package Class10;

public class Student {
    //Properties/Attributes
    String name;
    int age;
    String id;
// Methods/Functions/Behaviours
    void study(){
        System.out.println("Studying 16 hours a day.......");
    }
    public static void main(String[] args) {

        // we are creating an actual student by using the student class
        Student ehabObj=new Student();  //syntax
        ehabObj.name="Ehab";
        ehabObj.age=23;
        ehabObj.id="abc123";
        ehabObj.study();  //scanner.nextInt()

        Student habibObj=new Student();
        habibObj.name="habib";
        habibObj.age=20;
        habibObj.name="abd123";
        habibObj.study();


    }
}
