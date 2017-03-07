/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myclass;

/**
 *
 * @author af0054085
 */
public class MyClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Student student1 = new Student();
       student1.fName = "Austin";
       //student1.studentID = 1234567;
       student1.setStudentID(1234567);
       System.out.println("Student Id: " + student1.getStudentID());
       
       Student student2 = new Student();
       student2.fName = "Grant";
       
       Student student3 = new Student("Callie");
       
       Student student4 = new Student ("Rusty", false);
       
       student1.printName();
       student2.printName();
       student3.printName();
       student4.printName();
       
       //Demonstrate the static variable
       System.out.println(student1.getTestPercentage(95,100));
       System.out.println(student2.getTestPercentage(35,100));
       
       double avgGrade;
       avgGrade = student1.totalScores / Student.cntStudents;
       System.out.println(Student.totalScores + " " + Student.cntStudents + " " + avgGrade);
       
    }
    
}
