import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Exception2 {
    public static void main(String[] args) {
        try {
            PrintWriter pw=new PrintWriter("Test.java");
        } catch (FileNotFoundException e) {
        
            System.out.println("programmer");
        }
    }
}
