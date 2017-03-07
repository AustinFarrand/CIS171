/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author af0054085
 */
public class Array_Practice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] sourceArray = {2,10,8,4};
        int [] targetArray = new int[sourceArray.length];
        
        System.arraycopy(sourceArray, 0, targetArray, 0, sourceArray.length);
        for (int e: targetArray){
        System.out.print(e);
        }
    
        int x = 1;
        int [] y = new int [10];
        m(x,y);
        
        System.out.println("x is " + x);
        System.out.println("y[0] is " + y[0]);
        
        char[] chars = {'a','b','y','t','h'};
        java.util.Arrays.sort(chars);
        for (char e: chars){
            System.out.println(e);
        }
        
    }//End main
     public static void m(int number, int[] numbers){
     number = 1001;
     numbers[0] = 5555;
     
     }
}
