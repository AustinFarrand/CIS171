/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package use_bmi_class;

/**
 *
 * @author af0054085
 */
public class Use_BMI_Class {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BMI BMI1 = new BMI("John Doe", 45, 165, 73);
        BMI BMI2 = new BMI("Peter King", 50, 200, 70);
        
        System.out.println("The BMI for John Doe is: " + BMI1.getBMI() + BMI1.getStatus());
        System.out.println("The BMI for Peter King is : " + BMI2.getBMI() + BMI1.getStatus());
    }
    
}
