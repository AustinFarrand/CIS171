/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Austin
 */
import java.util.Scanner;
public class ISBN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //Create scanner object
    Scanner userInput = new Scanner(System.in);
    
    //Define variables
    String isbn;
    int lengthCheck;
    char d1,d2,d3,d4,d5,d6,d7,d8,d9,d10,d11,d12;
    
    
    System.out.println("Enter the first 12 digits of an ISBN-13: ");
    isbn = userInput.nextLine();
    lengthCheck = isbn.length();
    
    //check for isbn digit length.
    if(lengthCheck !=12){
        System.out.println(isbn + " is not a valid input.");
        
    }

    //Assign each character a digit.
    d1 = isbn.charAt(0);
    d2 = isbn.charAt(1);
    d3 = isbn.charAt(2);
    d4 = isbn.charAt(3);
    d5 = isbn.charAt(4);
    d6 = isbn.charAt(5);
    d7 = isbn.charAt(6);
    d8 = isbn.charAt(7);
    d9 = isbn.charAt(8);
    d10 = isbn.charAt(9);
    d11 = isbn.charAt(10);
    d12 = isbn.charAt(11);
    
    //formula
    int checksum = 10 - ((d1-48) + (3*d2-48) + (d3-48) + (3*d4-48) + (d5-48) + (3*d6-48) + (d7-48) + (3*d8-48) + (d9-48) + (3*d10-48) + (d11-48) + (3*d12-48)) % 10;
            
        if (checksum == 10){
            checksum = 0;
        }
            
    System.out.printf("%s%s",isbn,checksum);      
      
    }
    
}
