/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise9_7;

/**
 *
 * @author af0054085
 */
public class Exercise9_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Account account1 = new Account(1122,20000);
        account1.withdraw(2500);
        account1.deposit(3000);
        System.out.printf("Balance: %.2f \n Monthly Interest: %.2f \n Date: ", account1.getBalance(), account1.getMonthlyInterest(), account1.dateCreated());
    }
    
}
