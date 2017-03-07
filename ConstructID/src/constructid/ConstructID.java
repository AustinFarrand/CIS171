/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructid;
import javax.swing.*;

/**
 *
 * @author af0054085
 */
public class ConstructID {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog(null, "Enter your full name - first, middle, and last");
        String address = JOptionPane.showInputDialog(null, "Enter your street address");
        StringBuilder userID = new StringBuilder();
        name = extractInitials(name);
        address = extractNumbers(address);
        userID.append(name);
        userID.append(address);
                
        JOptionPane.showMessageDialog(null, "ID is " + userID);   
    }
    
    public static String extractInitials(String name){
        String idInitials = "";
        for(int i = 0; i < name.length(); i++){
            char initial = name.charAt(i);
            if(Character.isUpperCase(initial)){
                idInitials += initial;
            }
        }
        return idInitials;
    }
    
    public static String extractNumbers(String address){
        int i = address.indexOf(' ');
        String idNumber = address.substring(0, i);
        return idNumber;
    
    }
    
}
