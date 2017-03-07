/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author af0054085
 */

public class Arrays_Practice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**int[] values = new int[5];
        for (int i = 1; i < 5; i++){
            values[i] = i + values[i-1];
        }
        values[0] = values[1] + values[4];
        */
        
        java.util.Scanner input = new java.util.Scanner(System.in);
        double[] myList = new double[5], total;
        System.out.print("Enter " + myList.length + " values: \n");
        for (int i = 0; i < myList.length; i++){
            myList[i] = Math.random()*100;
            System.out.print(myList[i]+"\n");
            
            
        }
        
        
        
    }
    
}
