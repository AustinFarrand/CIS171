/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author af0054085
 */
import java.util.Scanner;
public class Practice_Exam_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int length, width, height;
        double price;
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("Enter the length of the room: ");
        length = userInput.nextInt();
        
        System.out.println("Enter the width of the room: ");
        width = userInput.nextInt();
        
        System.out.println("Enter the heigth of the room: ");
        height = userInput.nextInt();
        
        price = secondMethod(length, width, height);
        System.out.println("The price is : $" + price);
    }
    
    public static double secondMethod(int length, int width, int height){
        int gallonsOfPaint;
        double price;
        int area = length * width * 2;
        
        gallonsOfPaint = paintNeeded(area);
        System.out.println("You will need: " + gallonsOfPaint + " gallons of paint.");
        price = gallonsOfPaint * 32;
        return price;
    }
    
    public static int paintNeeded(int area){
        int gallonsOfPaint = 0, figureArea=0;
            while(figureArea < area){
                gallonsOfPaint++;
                figureArea += 350;
            }
            return gallonsOfPaint;
                
            
        
        
    }
    
}
