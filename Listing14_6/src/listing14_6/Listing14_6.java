/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listing14_6;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
/**
 *
 * @author af0054085
 */
public class Listing14_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DoubleProperty d1 = new SimpleDoubleProperty(1);
        DoubleProperty d2 = new SimpleDoubleProperty(2);
        System.out.println("d1 is " + d1.getValue() + " and d2 is " + d2.getValue());
         
        d1.bind(d2);
        System.out.println("d1 is " + d1.getValue() + " and d2 is " + d2.getValue());
        
        d2.setValue(70.2);
        
        System.out.println("d1 is " + d1.getValue() + " and d2 is " + d2.getValue());
    }
    
}
