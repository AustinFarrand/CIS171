
package exercise22_8;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Exercise22_8 {

    final static int ARRAY_SIZE = 10000;
    public static void main(String[] args) throws Exception {
        final long N = 1000001;
        
        long[] primeNumbers = new long[ARRAY_SIZE];
        long number;
        
        int squareRoot = 1;
        
        //start with a starting point
        RandomAccessFile inout = new RandomAccessFile("PrimeNumbers.dat", "rw");
        if(inout.length() == 0){
            number = 1;
        }
        else{
            inout.seek(inout.length() - 8);
            number = inout.readLong();
        }
        
        newNumber: while(number <= N){
            number++;
            
            inout.seek(0);
            if(squareRoot * squareRoot < number){
                squareRoot++;
            }
            while(inout.getFilePointer()<inout.length()){
                int size = readNextBatch(primeNumbers, inout);
                    
                    for(int k = 0; k < size && primeNumbers[k] <= squareRoot; k++){
                        if(number % primeNumbers[k] == 0){
                            continue newNumber;
                        }
                    }
                    
                    inout.seek(inout.length());
                    inout.writeLong(number);
            }
        }
    }
        
    public static int readNextBatch(long[] primeNumbers, RandomAccessFile inout){
        int size = 0;
        try {
            while(inout.getFilePointer() < inout.length() && size < ARRAY_SIZE){
                primeNumbers[size++] = inout.readLong();
            }
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        return size;
    }
}
