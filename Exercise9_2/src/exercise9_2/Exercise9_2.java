/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise9_2;

/**
 *
 * @author af0054085
 */
public class Exercise9_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stock stock1 = new Stock("ORCL", "Oracle Corporation", 34.5,34.35);
        System.out.printf("Price-change percentage is: %2.2f", stock1.getChangePercent());
    }
    
}
