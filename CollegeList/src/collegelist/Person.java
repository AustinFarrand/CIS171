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
public class Person {
    private String firstName, lastName, address, phoneNum;
    private int zip;
    
    public void setFirstName(){
        this.firstName = JOptionPane.showInputDialog(null, "Enter first name: ");
    }
    
    public void setLastName(){
        this.lastName = JOptionPane.showInputDialog(null, "Enter last name: ");
    }
    
    public void setAddress(){
        this.address = JOptionPane.showInputDialog(null, "Enter address: ");
    }
    
    public void setZip(){
        this.zip = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter zip code: "));
    }
    
    public void setPhoneNumber(){
        this.phoneNum = JOptionPane.showInputDialog(null, "Enter phone number: ");
    }
    
    public void displayPerson(){
        JOptionPane.showMessageDialog(null, "First Name: " + firstName + "\nLast Name: " + lastName + "\nAddress: " + address + "\nZip Code: " + zip + "\nPhone Number: " + phoneNum);
    }
}
