/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computeandinterpretbmi;
import java.util.Scanner;

/**
 *
 * @author af0054085
 */
public class ComputeAndInterpretBMI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
    // Prompt the user to enter weight in pounds
    System.out.print("Enter weight in pounds: ");
    double weight = input.nextDouble();
    
    // Prompt the user to enter height in inches
    System.out.print("Enter height in inches: ");
    double height = input.nextDouble();
    
    
    double bmi = getBMI(weight, height);
    

    // Display result
    System.out.println("BMI is " + bmi);
    if (bmi < 18.5)
      System.out.println("Underweight");
    else if (bmi < 25)
      System.out.println("Normal");
    else if (bmi < 30)
      System.out.println("Overweight");
    else
      System.out.println("Obese");
    }
    
    public static double getBMI(double weight, double height){
        final double KILOGRAMS_PER_POUND = 0.45359237; // Constant
        final double METERS_PER_INCH = 0.0254; // Constant 

        // Compute BMI
        double weightInKilograms = weight * KILOGRAMS_PER_POUND; 
        double heightInMeters = height * METERS_PER_INCH; 
        double bmi = weightInKilograms / 
        (heightInMeters * heightInMeters);     
        return bmi;
        }
  
    
    
}
