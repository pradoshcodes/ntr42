import java.util.function.Predicate;

public class Predic {
    public static void main(String[] args) {  
        Predicate<Integer> pr = num ->num % 2==0; // Creating predicate  
        System.out.println(pr.test(10));    // Calling Predicate method    
    }  

}
