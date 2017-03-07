/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author af0054085
 */
public class Exercise7_16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Define array and key
        int[] myArray = new int [100000];
        int key = (int)(Math.random() * 100000);
        
        //Loop for initializing array
        for(int i = 0; i < myArray.length; i++){
            myArray[i] = (int)(Math.random() * 100000);           
        }    
        
        //Linear Search
        long startTimeLin = System.currentTimeMillis();
        Linear(myArray, key);          
        long endTimeLin = System.currentTimeMillis();
        long executionTimeLin = endTimeLin - startTimeLin;
        System.out.println("The key for the Linear Search is: " + key);
        System.out.println(executionTimeLin);
        
        //Binary Search    
        long startTimeBin = System.currentTimeMillis();
        Binary(myArray, key);       
        long endTimeBin = System.currentTimeMillis();
        long executionTimeBin = endTimeBin - startTimeBin;
        System.out.println("The key for the Binary Search is: " + key);
        System.out.println(executionTimeBin);
    }
     
    public static int Linear(int[] myArray, int key){     
            for(int i = 0; i < myArray.length; i++){
            if (key == myArray[i]){              
            }
        }
            return key;
    }// End Method
    
    
    public static int Binary(int [] myArray, int key){
            java.util.Arrays.sort(myArray);
            int low = 0; 
            int high = myArray.length - 1;
            while(high >= low){
                int mid = (low + high) / 2;
                if (key < myArray[mid]){
                    high = mid - 1;
                }
                else if (key == myArray[mid]){
                    return key;
                }
                else {
                    low = mid + 1;
                }      
            } 
                return 0;
        }//End Method
  
}


