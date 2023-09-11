package Class20;

public class StudentTester {
    public static void main(String[] args) {
        Student[] array={new SyntaxStudent(),new CollegeStudent(),new SchoolStudent()};
        for(Student s:array){
            s.Homework();
            s.plays();
            s.travel();
        }
    }
}
