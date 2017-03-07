/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author af0054085
 */
public class FeelingLucky {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int firstNumber, secondNumber, thirdNumber; 
        firstNumber = (int)(Math.random()*3);
        secondNumber = (int)(Math.random()*3);
        thirdNumber = (int)(Math.random()*3);
        
        
            if(firstNumber == secondNumber && firstNumber == thirdNumber){
                System.out.println("Super Jackpot Winner");               
            }
            
            else if (firstNumber == secondNumber || firstNumber == thirdNumber || secondNumber == thirdNumber){
                System.out.println("Mini Jackpot Winner");               
            }
            
            else{
                System.out.println("No Winner");               
            }
            
                
                
                
        
    }
    
}
