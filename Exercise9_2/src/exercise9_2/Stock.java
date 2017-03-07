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
public class Stock {
    String symbol, name;
    double previousClosingPrice, currentPrice;
    private double amountChanged, percentChanged;
    
    Stock(){
    }
    
    Stock(String userSymbol, String userName, double ClosingPrice, double Price ){
        symbol = userSymbol;
        name = userName;
        previousClosingPrice = ClosingPrice;
        currentPrice = Price;
    }
    
    public double getChangePercent(){
        amountChanged = currentPrice - previousClosingPrice;
        percentChanged = amountChanged / previousClosingPrice * 100;
        return percentChanged;
    }
}
