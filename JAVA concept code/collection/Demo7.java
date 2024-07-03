import java.util.HashSet;
import java.util.Set;

public class Demo7 {
    public static void main(String[] args) {
        Set<Integer> s1= new HashSet<Integer>();
        s1.add(10);
        s1.add(20);
        s1.add(30);
        s1.add(40);
        s1.add(50);
        Set<Integer> s2= new HashSet<Integer>();
        s2.add(40);
        s2.add(50);
        s2.add(60);
        s2.add(70);
        s1.addAll(s2);
        System.out.println(s1);
        s1.retainAll(s2);
        System.out.println(s1);
        s1.removeAll(s2);
        System.out.println(s1);
        System.out.println(s2);
        //bu converting set to list we can use sort() method.
    }
}
