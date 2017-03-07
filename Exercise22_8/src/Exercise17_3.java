

import java.io.IOException;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exercise17_3 {
    public static void main(String args[]) throws Exception{
        printFile();
    }

    
    public static void printFile() throws IOException {
        long count = 0;
        try(
            DataInputStream dis =  
                    new DataInputStream(new FileInputStream("Exercise17_3.dat"));
                ){
            long total = 0;
            while(dis.available() > 0){
                long temp = dis.readLong();
                total += temp;
                count++;
                if(count % 10 == 0){
                    System.out.print("\n" + temp + " ");
                }
                else{
                    System.out.print(temp + " ");
                }
                System.out.print(temp + " ");
            }//end while
            
            System.out.println("\nCount is " + count);
            System.out.println("\nTotal is " + total);
        }//end try
        catch(FileNotFoundException ex){
            System.out.println("File not found");
        }//end catch
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }//end main
}//end class
