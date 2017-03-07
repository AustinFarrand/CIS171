/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collegelist;
import javax.swing.*;

/**
 *
 * @author af0054085
 */
public class Student extends Person {
    private String major;
    private double gpa;
    
    public void setMajor(){
        this.major = JOptionPane.showInputDialog(null, "Enter Major: ");
    }
    
    public void setGPA(){
        this.gpa = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter GPA: "));
    }
    
    public void Display(){
        super.displayPerson();
        JOptionPane.showMessageDialog(null, "\nStudent's Major: " + major + "\nStudent's GPA: " + gpa);
    }
}
