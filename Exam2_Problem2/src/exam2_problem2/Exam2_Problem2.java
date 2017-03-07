/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam2_problem2;

/**
 *
 * @author af0054085
 */
public class Exam2_Problem2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Billing billing1 = new Billing();
        System.out.println("The total for a photobook that costs $24.99 is: $" + billing1.computeBill(24.99));
        System.out.println("The total for four photobooks that cost $17.50 is: $" + billing1.computeBill(17.50, 4));
        System.out.println("The total for six photobooks that cost $10.00 with a $20 coupon is : $" + billing1.computeBill(10.00, 6, 20));
    }
    
}
