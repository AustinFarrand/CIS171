/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demonstrating.inheritance;
import java.util.Scanner;
import java.util.*;

/**
 *
 * @author af0054085
 */
public class DemonstratingInheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int guests, choice;
        
        Party aParty = new Party();
        DinnerParty aDinnerParty = new DinnerParty();
        
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter number of guests for the party>> ");
        guests = keyboard.nextInt();
        aParty.setGuests(guests);
        System.out.println("The party has " + aParty.getGuests() + " guests");
        aParty.displayInvitation();
        
        System.out.print("Enter number of guests for the dinner>> ");
        guests = keyboard.nextInt();
        aDinnerParty.setGuests(guests);
        
        System.out.print("Enter the menu option - 1 for chicken or 2 for Beef>> ");
        choice = keyboard.nextInt();
        aDinnerParty.setDinnerChoice(choice);
        
        System.out.println("The dinner party has " +  aDinnerParty.getGuests() + "guests");
        System.out.println("Menut option " + aDinnerParty.getDinnerChoice() + " will be served");
        
        aDinnerParty.displayInvitation();
        
    }
    
}
