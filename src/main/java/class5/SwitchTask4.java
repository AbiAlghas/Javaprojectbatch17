package class5;

import java.util.Scanner;

public class SwitchTask4 {
        //Write a program that will read three inputs of scores (quiz, mid term, and final scores) and determine the grade based on the following rules:
    //if the average score >=90 → grade=A
    //if the average score >= 70 and <90 → grade=B
    //if the average score>=50 and <70 → grade=C
    //if the average score<50 → grade=F
        public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
            System.out.println("The output of the quiz");
            int quiz= input.nextInt();
            System.out.println("The output of the mid term");
            int midterm= input.nextInt();
            System.out.println("The output of the final score");
            int finalterm= input.nextInt();
            int averagescore=(quiz+midterm+finalterm)/3;

            if(averagescore>=90){System.out.println("grade a");}
            if(averagescore>=70){System.out.println("grade b");}
            if(averagescore>=50&&averagescore>=50){System.out.println("grade c");}
            if(averagescore<50){System.out.println("grade f");}




        }
    }

