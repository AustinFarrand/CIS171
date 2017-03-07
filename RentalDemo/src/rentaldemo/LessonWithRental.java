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
public class LessonWithRental extends Rental {
    protected Boolean lessonRequired;
    protected final String [] INSTRUCTORS = {"Carl", "Stephen", "Sarah", "Tom", "Ray", "Rachel", "Pat", "Bob"};
    
    LessonWithRental(String contractNum, int minutes, int equipment){
        super(contractNum, minutes);
        this.equipmentType = equipment;
    }
}
