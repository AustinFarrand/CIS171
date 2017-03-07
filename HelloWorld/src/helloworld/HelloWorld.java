/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

/**
 *
 * @author af0054085
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello World");
        
         System.out.print("a\t" + "a^2\t" + "a^3\t\n");
        for(int i = 1; i < 5; i++){
            int a = i*i;
            int b = (i*i*i);
            System.out.println(i + "\t" + a + "\t" + b);
        }
    }
}
