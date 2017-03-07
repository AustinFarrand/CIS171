/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise9_7;
import java.util.Date;

/**
 *
 * @author af0054085
 */
public class Account {
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private Date dateCreated = new Date();
    
    Account(){
    }
    
    Account(int myId, double myBalance){
        id = myId;
        balance = myBalance;
    }
    
    public void setId(){
      this.id = id;  
    }
    
    public void setBalance(){
        this.balance = balance;
    }
    
    public void setAnnualInterest(){
        this.annualInterestRate = 4.5 / 100;
    }
    
    public double getMonthlyInterestRate(){
        double monthlyInterestRate = this.annualInterestRate / 12;
        return monthlyInterestRate;
    }
    
    public double getMonthlyInterest(){
        double monthlyInterest = this.balance * (this.annualInterestRate / 12);
        return monthlyInterest;
    }
    
    public double withdraw(double x){
        double withdraw = x;
        this.balance = balance - withdraw;
        return balance;
    }
    
    public double deposit(double x){
        double deposit = x;
        return balance + deposit;
    }
    
    public int getId(){
        return id;
    }
    
    public double getBalance(){
        return balance;
    }
    
    public double getAnnualInterestRate(){
        return annualInterestRate;
    }
    
    public Date dateCreated(){
        return dateCreated;
    }
}
