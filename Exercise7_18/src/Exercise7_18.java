/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author af0054085
 */
import java.util.Scanner;
public class Exercise7_18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        double [] numbers = new double[10];
        
        System.out.println("Enter ten numbers: ");
        for(int i = 0; i < numbers.length; i++){          
            numbers[i] = userInput.nextDouble();
        }
        
        BubbleSort(numbers);
        
        System.out.println("Sorted numbers: ");
        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }
    
        public static void BubbleSort(double [] numbers){
            double index = 0;
            for(int i = 0; i < numbers.length; i++){
                for(int k = 1; k < (numbers.length - i); k++){
                    if(numbers[k - 1] > numbers[k]){
                        index = numbers[k - 1];
                        numbers[k - 1] = numbers[k];
                        numbers[k] = index;
                    }
                }
            
            }
        
        }  
}
    
    

