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
public class Exam_Prac_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int number, number2;
        
        System.out.println("Enter a number: ");
        number = userInput.nextInt();
        
        System.out.println("Enter a second number: ");
        number2 = userInput.nextInt();
        displayTwiceTheNumber(number, number2);
        displayNumberTwiceFive(number, number2);
          
    }
    public static void displayTwiceTheNumber(int number, int number2){
        System.out.println("Twice the number is: " + number * number);
        System.out.println("Twice the second number is: " + number2 * number2);
    }
    
    public static void displayNumberTwiceFive(int number, int number2){
        number = number + 5;
        number2 = number2 + 5;
        
        System.out.println("The first number plus five is: " + number);
        System.out.println("The second number plus five is: " + number2);
    }
}
