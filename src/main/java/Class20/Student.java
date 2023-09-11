package Class20;

public class Student {
   public  void Homework(){
        System.out.println("Student are doing homework");
    }
    public void plays(){
        System.out.println("Student are not playing sports together");
    }
    public void travel() {
        System.out.println("Student are traveling together");
    }}
class SyntaxStudent extends Student{
    @Override
   public void Homework() {
        System.out.println("Student are not doing Homework");
    }
}
class CollegeStudent extends Student{
    @Override
    public void plays() {
        System.out.println("Student plays together ");
    }
}
class SchoolStudent extends Student{
}



