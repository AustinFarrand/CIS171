/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentaldemo;

/**
 *
 * @author af0054085
 */
public class Rental {
    protected String contactNum;
    int minutes;
    int equipmentType;
    
    Rental(String contactNum, int minutes){
        this.contactNum = contactNum;
        this.minutes = minutes;
    }
    
}
