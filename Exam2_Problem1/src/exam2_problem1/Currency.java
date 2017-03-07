/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam2_problem1;

/**
 *
 * @author af0054085
 */
public class Currency {
   
    
    public Currency(){
    }
    
    
    public double ExchangeUSD(double amount, double rate){
        double dollarToYuan = amount * rate;
        return dollarToYuan;
    }
    
    public double ExchangeRMB(double amount, double rate){
        double yuanToDollar = amount / rate;
        return yuanToDollar;
    }
}
