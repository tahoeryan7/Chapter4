package Chapter4;
// ****************************************************************
//   Student.java
//
//   Define a student class that stores name, score on test 1, and
//   score on test 2.  Methods prompt for and read in grades,
//   compute the average, and return a string containing student's info.
// ****************************************************************
import java.util.Scanner;
public class Student
{
    //declare instance data
    private String name;
    private int score1;
    private int score2;
    Scanner scan =new Scanner(System.in); 
    
    //-----------------------------------------------
    //constructor
    //-----------------------------------------------
    public Student(String studentName)
    {
        //add body of constructor
        this.name=studentName;
    }
    //-----------------------------------------------
    //inputGrades: prompt for and read in student's grades for test1 and test2.
    //Use name in prompts, e.g., "Enter's Joe's score for test1".
    //-----------------------------------------------
    public void inputGrades()
    {
        score1 = scan.nextInt();
        score2 = scan.nextInt();
        //add body of inputGrades
    }
    //-----------------------------------------------
    //getAverage: compute and return the student's test average
    //-----------------------------------------------
    //add header for getAverage
    {
        //add body of getAverage
    }
    //-----------------------------------------------
    //getName: return the student's name
    //-----------------------------------------------
    //add header for getName
    {
        //add body of getName
    }
    //-----------------------------------------------
    //printName: print the student's name
    //-----------------------------------------------
    //add header for printName
    {
        //add body of printName
    }
}
