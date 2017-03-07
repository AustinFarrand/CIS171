/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam2_problem1;
import java.util.Scanner;

/**
 *
 * @author af0054085
 */
public class Exam2_Problem1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double amount, rate;
        int dollarOrYuan;
        Scanner userInput = new Scanner(System.in);
        Currency currency1 = new Currency();
        
        System.out.print("Enter the exchange rate from dollars to RMB: ");
        rate = userInput.nextDouble();
        
        System.out.print("Enter 0 to convert USD to RMB or 1 to convert RMB to USD: ");
        dollarOrYuan = userInput.nextInt();
        
            if(dollarOrYuan == 0){
                System.out.print("Enter the dollar amount: ");
                amount = userInput.nextDouble();
                System.out.println(amount + " is " + currency1.ExchangeUSD(amount, rate) + " Yuan");
            }
            else if(dollarOrYuan == 1){
                System.out.print("Enter the RMB amount: ");
                amount = userInput.nextDouble();
                System.out.println(amount + " is " + "$" + currency1.ExchangeRMB(amount, rate));
            }
            else{
                System.out.print("Incorrect input");
            }
    }
    
}
