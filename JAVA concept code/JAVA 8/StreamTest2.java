import java.util.ArrayList;

public class StreamTest2 {
    public static void main(String[] args) {
      ArrayList<Integer> numbers=new ArrayList<>();
      numbers.add(12);
      numbers.add(45);
      numbers.add(76);
      numbers.add(34);
      numbers.add(65);

      for (int  integer : numbers) {
        if (integer%2==0) {
            numbers.add(integer);
        }
      }
      System.out.println(numbers);
      
    }
}