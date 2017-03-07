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
public class Billing {
    public final double TAX = .08;
    
    Billing(){
    }
    
    public double computeBill(double photobook){
        double taxAmount = photobook * TAX;
        double total = photobook + taxAmount;
        return total;
    }
    
    public double computeBill(double photobook, int quantity){
        double amount = photobook * quantity;
        double taxAmount = amount * TAX;
        double total = amount + taxAmount;
        return total;
    }
    
    public double computeBill(double photobook, int quantity, double coupon){
        double amount = photobook * quantity - coupon;
        double taxAmount = amount * TAX;
        double total = amount + taxAmount;
        return total;
    }
}
