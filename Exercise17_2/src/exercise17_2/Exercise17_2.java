
package exercise17_2;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.DataOutputStream;

public class Exercise17_2 {

    
    public static void main(String[] args) throws IOException {
        try (
            DataOutputStream output = 
                    new DataOutputStream(new FileOutputStream("Exercise17_2.dat", true));
                ){
            for(int i = 0; i < 100; i++)
                output.writeInt((int)(Math.random() * 100000));
        }//end try
        System.out.println("Done");
    }
    
}
