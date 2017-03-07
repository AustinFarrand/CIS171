/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demopoems;

/**
 *
 * @author af0054085
 */
public class DemoPoems {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int COUP_LINES = 2;
        final int LIM_LINES = 5;
        final int HAI_LINES = 3;
        
        Poem jupiter = new Poem("Jupiter", 23);
        System.out.println(jupiter.toString());
        
        Couplet saturn = new Couplet("Saturn", COUP_LINES );
        System.out.println(saturn.toString());
        
        Limerick venus = new Limerick("Venus", LIM_LINES);
        System.out.println(venus.toString());
        
        Haiku mars = new Haiku("Mars", HAI_LINES);
        System.out.println(mars.toString());
    }
    
}
