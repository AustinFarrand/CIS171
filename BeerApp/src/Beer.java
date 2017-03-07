/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author af0054085
 */
public class Beer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int bottles = 99;
        
        while(bottles < 100 && bottles > 0)
        { 
            System.out.println(bottles + " bottles of beer on the wall," + bottles + " bottles of beer, take one down pass it around");
            bottles = bottles - 1;
            System.out.println(bottles + " bottles of beer on the wall");                
        }
        if (bottles ==1)
        {
            System.out.println(bottles + " bottles of beer on the wall," + bottles + "bottles of beer, take on down pass is around");
        }
        if (bottles == 0)
        {
        System.out.println("You're all out of beer");
        }
       
        // TODO code application logic here
    }
    
}
