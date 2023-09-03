package Class13;

public class Students {
    //Create a Class called Students
    //Create three  variables  Name , ID  and  numberOfStudents
    //Create three objects of the Students Class
    //Set the value for  studentName , studentID and increment
    // the numberOfStudents for each object
    //Print out  total number of students

    String Name;
    String ID;
    static int NumberOfStudents;

    public static void main(String[] args) {
        Students obj=new Students();
        obj.Name="Asghar";
        obj.ID="A17";
        NumberOfStudents++;
        Students obj1=new Students();
        obj.Name="Sumair";
        obj.ID="S17";
        NumberOfStudents++;
        Students obj2=new Students();
        obj.Name="Afsar";
        obj.ID="k17";
        NumberOfStudents++;
        Students obj3=new Students();
        obj.Name="Ehab";
        obj.ID="E17";
        NumberOfStudents++;
        Students obj4=new Students();
        obj.Name="Alghas";
        obj.ID="AA17";
        NumberOfStudents++;
        Students obj5=new Students();
        obj.Name="Jamel";
        obj.ID="J17";
        NumberOfStudents++;
        System.out.println("Total number of students "+NumberOfStudents);

    }
}

