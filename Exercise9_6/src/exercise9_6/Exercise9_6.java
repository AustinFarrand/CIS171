/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise9_6;

/**
 *
 * @author af0054085
 */
public class Exercise9_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] myArray = new int [100000];
        Stopwatch stopwatch1 = new Stopwatch();
        
        
        for(int i = 0; i < myArray.length; i++){
            myArray[i] = (int)(Math.random() * 100000);            
        }   
        
      stopwatch1.getStartTime();
      for (int i = 0; i < myArray.length - 1; i++) {
        int smallest = myArray[i];
        int nextSmallest = i;

      for (int j = i + 1; j < myArray.length; j++) {
        if (smallest > myArray[j]) {
          smallest = myArray[j];
          nextSmallest = j;
        }
      }

      if (nextSmallest != i) {
        myArray[nextSmallest] = myArray[i];
        myArray[i] = smallest;
      }
    }
     stopwatch1.getEndTime();
     System.out.println(stopwatch1.getElapsedTime());
     
    }
    
}
