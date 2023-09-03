package Class12;

public class HW2 {
   //Create  class Student that will have a method getGrade. Your method should accept
   // the score of a student and return a grade:
   //score > 90 - A
   //score >80 - B
   //score >70 - C
   //score > 50 - D
   //anything else - F

    String grades(int num1){
            if(num1>90) {
                return "A";
            }else if(num1>80) {
                return "B";
            }else if(num1>70){
                return "C";
            } else if(num1>50) {
                return "D";
            }else{
                return "F";
            }

    }
    }


