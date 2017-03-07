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
public class Student {
    public String fName;
    static int totalScores;
    static int cntStudents;
    private int studentID;
    public boolean isScienceMajor;
    public char gender;
    
    public Student(){
    studentID = this.createID();
    }
    
    
    
    private int createID(){
        int randInt = (int)(Math.random() * 100000);
        return randInt;
    }
    
    public Student(String aName){
        fName = aName;
    }
    
    public Student (String aName, boolean Scientist){
        fName = aName;
        isScienceMajor = Scientist;
    }
    
    public void setStudentID(int theID){
        int length = String.valueOf(theID).length();
        if (length < 5){
            System.out.print("Invalid ID length");
        }
        else{
            studentID = theID;
        }
        
        
        studentID = theID;
    }
    
    public int getStudentID(){
        return studentID;
    }
    
    public double getTestPercentage(double totScore, double possPoints){
        totalScores += totScore;
        cntStudents++;
        return (double)(totScore / possPoints);
    }
    
    public void printName(){
        System.out.println(fName);
        System.out.printf("ID: %d\tScience Major: %b\tGender: %c\n", studentID, isScienceMajor, gender );
    }
}
