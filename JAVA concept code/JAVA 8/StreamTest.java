import java.util.ArrayList;

public class StreamTest {
    public static void main(String[] args) {
      ArrayList<Integer> numbers=new ArrayList<>();
      numbers.add(12);
      numbers.add(45);
      numbers.add(76);
      numbers.add(34);
      numbers.add(65);

      for (Integer integer : numbers) {
        if (integer%2==0) {
            System.out.println(integer);
        }
      }
    }
}