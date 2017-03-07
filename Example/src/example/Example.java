/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example;

/**
 *
 * @author af0054085
 */
public class Example {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StringBuilder nameString = new StringBuilder("Barbara");
        int nameStringCapacity = nameString.capacity();
        System.out.println("Capacity of nameString is " + nameStringCapacity);
        
        StringBuilder addressString;
        addressString = new StringBuilder("6311 Hickory Nut Grove Road");
        int addStringCapacity = addressString.capacity();
        System.out.println("Capacity of addressString is " + addStringCapacity);
        
        nameString.setLength(20);
        System.out.println("The name is " + nameString + " end");
        addressString.setLength(20);
        System.out.println("The address is " + addressString);
    }
    
}
