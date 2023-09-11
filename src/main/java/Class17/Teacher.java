package Class17;

public class Teacher {
    String Name;
    String Subject;

    void teach() {
        System.out.println("Today we will learn java");
    }

    void grade() {
        System.out.println("Grading Test");
    }

    void talk() {
        System.out.println("No classs today");
    }

    void eat() {
        System.out.println("nhum nhum");
    }

}
    class MathTeacher extends Teacher{
        int schoolHours;
        void printHours(){
            System.out.println(schoolHours);
        }
    }
    class ChemistryTeacher extends MathTeacher{
        int numOfClasses;
        void printClasses(){
            System.out.println(numOfClasses);
        }
    }
    class PianoTeacher extends ChemistryTeacher{
        int numOfStudents;
        void printStudents(){
            System.out.println(numOfStudents);
        }
    }

