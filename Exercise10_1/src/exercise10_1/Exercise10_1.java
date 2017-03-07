/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise10_1;

/**
 *
 * @author af0054085
 */
public class Exercise10_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Time time1 = new Time();
        System.out.println("Hour: " + time1.getHour() + " Minute: " + time1.getMinute() + " Second: " + time1.getSecond());
        
        Time time2 = new Time(555550000);
        System.out.print("Hour: " + time2.getHour() + " Minute: " + time2.getMinute() + " Second: " + time2.getSecond());
        
    }
    
}
