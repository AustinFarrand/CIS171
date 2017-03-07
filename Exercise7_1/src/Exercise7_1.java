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
public class Exercise7_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Scanner input = new Scanner(System.in);
        
        double[] scoreList = new double[5];
        
        System.out.println("Enter the four scores: ");
        scoreList[0] = input.nextInt();
        scoreList[1] = input.nextInt();
        scoreList[2] = input.nextInt();
        scoreList[3] = input.nextInt();
        
        double bestScore = scoreList[0];
        for(int i = 0; i < scoreList.length; i++){
            if(scoreList[i] > bestScore){
                bestScore = scoreList[i];
            }       
        }
        
        if(scoreList[0] >= bestScore - 10){
            System.out.println("Student 0 scored an A");
        }
        else if (scoreList[0] >= bestScore - 20){
            System.out.println("Student 0 scored a B");
        }
        else if (scoreList[0] >= bestScore - 30){
            System.out.println("Student 0 scored a C");
        }
        else if (scoreList[0] >= bestScore - 40){
            System.out.println("Student 0 scored a D");
        }
        else System.out.println("Student 0 scored an F");
        
        
        if(scoreList[1] >= bestScore - 10){
            System.out.println("Student 1 scored an A");
        }
        else if (scoreList[1] >= bestScore - 20){
            System.out.println("Student 1 scored a B");
        }
        else if (scoreList[1] >= bestScore - 30){
            System.out.println("Student 1 scored a C");
        }
        else if (scoreList[1] >= bestScore - 40){
            System.out.println("Student 1 scored a D");
        }
        else System.out.println("Student 1 scored an F");
        
        
        if(scoreList[2] >= bestScore - 10){
            System.out.println("Student 2 scored an A");
        }
        else if (scoreList[2] >= bestScore - 20){
            System.out.println("Student 2 scored a B");
        }
        else if (scoreList[2] >= bestScore - 30){
            System.out.println("Student 2 scored a C");
        }
        else if (scoreList[2] >= bestScore - 40){
            System.out.println("Student 2 scored a D");
        }
        else System.out.println("Student 2 scored an F");
        
        
        if(scoreList[3] >= bestScore - 10){
            System.out.println("Student 3 scored an A");
        }
        else if (scoreList[3] >= bestScore - 20){
            System.out.println("Student 3 scored a B");
        }
        else if (scoreList[3] >= bestScore - 30){
            System.out.println("Student 3 scored a C");
        }
        else if (scoreList[3] >= bestScore - 40){
            System.out.println("Student 3 scored a D");
        }
        else System.out.println("Student 3 scored an F");
    }
}
