import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.*;

public class Main {
    public static void main(String[] args) {
      List<String> al=Arrays.asList("Rahul","Harish","Vigor","panda");
        System.out.println(al);
        List<String> rename=al.stream().sorted().map(name->name.toUpperCase()).collect(Collectors.toList());
        System.out.println(rename);
    }
}
