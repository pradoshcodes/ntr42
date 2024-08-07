import java.util.function.Function;

public class Predefined {
    public static void main(String[] args) {
    Function<Integer,Integer> li=num-> num * num;
    System.out.println(li.apply(6));//predefined functional interface
    }
}
