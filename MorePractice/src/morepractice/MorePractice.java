/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morepractice;
import java.util.Scanner;
/**
 *
 * @author af0054085
 */
public class MorePractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String firstName = input.nextLine();
        
        System.out.print("Enter your last name: ");
        String lastName = input.nextLine();
        
        System.out.print("Enter your birthday (dd/mm/yy): ");
        String birthday = input.nextLine();
           
        String id = extractInitials(firstName, lastName) + extractNumbers(birthday);
        System.out.println("Your id is: " + id);
        
        for(int i = 0; i < 2; i++){
            char initials = id.charAt(i);
            System.out.print(initials);
        }
        
        int [] myArray = new int[10];
        
        System.out.println("Enter numbers into array: ");
        for (int i = 0; i < myArray.length; i++){
            myArray[i] = input.nextInt();     
        }
        
        System.out.print("Print the array: ");
        for(int i = 0; i < myArray.length; i++){
              System.out.print(myArray[i]);
        }
        
        
        
    }
    
    public static String extractInitials(String first, String last){
        String initials = first.substring(0,1) + last.substring(0,1);
        return initials;
    }
    
    public static String extractNumbers(String birth){
        String numbers = birth.substring(0,2) + birth.substring(3,5) + birth.substring(6,8);
        return numbers;
    }
}
