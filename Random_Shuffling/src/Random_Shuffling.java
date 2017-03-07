/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author af0054085
 */
public class Random_Shuffling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] myList = new double[4];
        for(int i = 0; i < myList.length - 1; i++){
            
            int j = (int)(Math.random() * myList.length);
            
            double temp = myList[i];
            myList[i] = myList[j];
            myList[j] = temp;
        
          
        }
        
        double temp = myList[0];
        
        for (int i = 1; i < myList.length; i++){
            myList[i - 1] = myList[i];
        }
        
        myList[myList.length - 1] = temp;
    }
    
    
        
        
        
    
    
}
