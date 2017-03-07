/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author af0054085
 */
public class Conversion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int value = 1;
        int kilo = 1; 
        double lbs = 2.2;
        
        System.out.println("Kilograms\t" + "Pounds");
        while(value <= 199 && kilo <= 199){
        System.out.println(kilo +" \t\t" + lbs * kilo);
        value++;
        kilo++;
        
        }
    }
    
}
