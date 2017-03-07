
package listing22_5;
import java.util.Scanner;

public class Listing22_5 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Find all prime number <= n, enter n: ");
        int n = input.nextInt();
        
        final int NUMBER_PER_LINE = 10;
        
        int count = 0; //count the numer of prime numberz we found
        int number = 2; //a number to be tested for prime-ness
        
        System.out.println("The prime numbers are: ");
        
        //repeatedly find prime numbers
        while (number <= n){
            //assume the number is prime
            boolean isPrime = true;
            //test if number is prime
            for(int divisor = 2; divisor <=(int)(Math.sqrt(number)); divisor++){
                if(number % divisor == 0){
                    isPrime = false;
                    break;
                }
            }
            //print the prime number and increase the count
            if(isPrime){
                count++;
                if(count % NUMBER_PER_LINE == 0){
                    System.out.printf("%7d\n", number);
                }
                else
                    System.out.printf("%7d", number);
            }
            number++;
        }
        System.out.println("\n" + count + "prime(s) less than or equal to " + n);
    }
    
    
}
