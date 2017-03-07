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
public class Something {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String firstBlank, secondBlank, thirdBlank;
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("Hello, human. Type a word: ");
        firstBlank = userInput.next();
        
        System.out.println("Haha, that's a good one. Type another word: ");
        secondBlank = userInput.next();
        
        System.out.println("Type another one: ");
        thirdBlank = userInput.next();
        
        System.out.println("That one wasn't as good...let's move on.");
        System.out.println("Happy Birthday to, " + firstBlank + ", Happy Birthday to, " + secondBlank + ", Happy Birthday to, " + thirdBlank + ", Happy Birthday to you. ");
        System.out.println("This song doesn't make any sense");
        
    }
    
}
