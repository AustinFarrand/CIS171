/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise22_14;

/**
 *
 * @author af0054085
 */
public class Exercise22_14 {

    
    public static void main(String[] args) {
        System.out.println("\t\t8,000,000 \t10,000,000 \t12,000,000 \t14,000,000 \t16,000,000 \t18,000,000");
        System.out.println("\t\t------------------------------------------------------------------------------------------");
        System.out.print("Listing 22.5 \t");
        for(int i = 0; i < 6; i++){
            long startTime = System.currentTimeMillis();
            int n = (8000000 + i * 2000000);
            primeNumbers(n);
            long endTime = System.currentTimeMillis() - startTime;
            System.out.print(endTime + "\t\t");
        }
         
        System.out.print("\nListing 22.6 \t");
        for(int i = 0; i < 6; i++){
            long startTime = System.currentTimeMillis();
            int n = (8000000 + i * 2000000);
            efficientPrimeNumbers(n);
            long endTime = System.currentTimeMillis() - startTime;
            System.out.print(endTime + "\t\t");
        }
        
        System.out.print("\nListing 22.7 \t");
        for(int i = 0; i < 6; i++){
            long startTime = System.currentTimeMillis();
            int n = (8000000 + i * 2000000);
            sieveOfEratosthenes(n);
            long endTime = System.currentTimeMillis() - startTime;
            System.out.print(endTime + "\t\t");
        }
    }
    
    public static void primeNumbers(int n){    
        int number = 2; //a number to be tested for prime-ness    
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
            //increase the count
            if(isPrime){            
            }
            number++; 
        }
    }
    
    public static void efficientPrimeNumbers(int n){
        java.util.List<Integer> list = new java.util.ArrayList<>();
        int number = 2; //number to be tested for prime-ness
        int squareRoot = 1; //check whether number <= sqareRoot
        //repeatedly find prime numbers
        while (number <= n){
            //assume number is prime
            boolean isPrime = true;
            
            if(squareRoot * squareRoot < number) squareRoot++;
            
            //test if number is prime
            for(int k = 0; k < list.size() && list.get(k) <= squareRoot; k++){
                if(number % list.get(k) == 0){ //if true, not prime
                    isPrime = false; //set isPrime to false
                    break; //exit for loop
                }
            }
            //increase count
            if(isPrime){
            }
            number++;
        }
    }
    
    public static void sieveOfEratosthenes(int n){
        boolean[] primes = new boolean[n + 1];
        
        //initialize primes[i] to true
        for(int i = 0; i < primes.length; i++){
            primes[i] = true;
        }
        
        for(int k = 2; k <= n/k; k++){
            if(primes[k]){
                for(int i = k; i <= n/k; i++){
                    primes[k * i] = false; //k * i is not prime
                }
            }
        }
    }
    
}
