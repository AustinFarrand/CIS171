/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise13_4;
import java.util.*;
/**
 *
 * @author af0054085
 */
public class Exercise13_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Input month Jan = 1, Feb = 2, etc...
        System.out.print("Enter the month(1-12) \n--->(input a 0 to use the current month): ");
        int month = input.nextInt() - 1; //Calendar class begins counting months at zero; therefore, 1 is subtracted from user input.
        
        //Input the year
        System.out.print("Enter the year \n--->(input a 0 to use the current year): ");
        int year = input.nextInt();
        
        //Create calendar object. 1st day of the month is used as a default argument.  
        Calendar calendar1 = new GregorianCalendar();
        int daysOfMonth = calendar1.getActualMaximum(Calendar.DAY_OF_MONTH);//Recieve the number of days in specified month.
        
        //For running the program without the user inputting the month.
        if(month == -1){
            month = calendar1.get(Calendar.MONTH);
        }

        //For running the program without the user inputting the year.
        if(year == 0){
            year = calendar1.get(Calendar.YEAR);
            
        }   
        
        //Variable stores which day of the week(Sun = 1, Mon = 2, etc..) the first of the month falls on.
        int dayOfWeek = calendar1.get(Calendar.DAY_OF_WEEK);
        
        
        System.out.println("\t\t" + getMonth(month) + ", " + year);
        System.out.println("----------------------------------------------------");
        System.out.println("Sun\t" + "Mon\t" + "Tue\t" + "Wed\t" + "Thu\t" + "Fri\t" + "Sat");
        
        //For loop prints a tab until first day of the month is reached.
        for(int i = 1; i < dayOfWeek; i++ ){
            System.out.print("\t");
        }
        
        //This block formats the numbers portion of the calendar. The k variable determines when a new line should start.
        int k = dayOfWeek - 1;
        for(int i = 1; i < daysOfMonth + 1; i++){       
            System.out.print(i + "\t");
                 k++;                                
                if(k==7){
                    System.out.print("\n");
                    k = 0;
                }
        }  
    }
    
    //Switch statement returns the month as a String.
    public static String getMonth(int month){
        switch(month){
            case 0: return "January";
            case 1: return "February";
            case 2: return "March";
            case 3: return "April";
            case 4: return "May";
            case 5: return "June";
            case 6: return "July";
            case 7: return "August";
            case 8: return "September";
            case 9: return "October";
            case 10: return "November";
            case 11: return "December";
            default: return "error";
        }
        
        
        
    } 
}
