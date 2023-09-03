package Class16;

public class Student {
    String name;
    String address;

    public Student(String name,String address){
        this.name=name;
        this.address=address;
    }
        public void displayInfo(){
            System.out.println("Name of student: "+name);
            System.out.println("Address of Student: "+address);

    }

    public static void main(String[] args) {
        Student s1=new Student("Alghas","Toronto ");
        s1.displayInfo();
    }
}
