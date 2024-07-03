import java.util.LinkedHashSet;

public class Linkedhs {
    public static void main(String[] args) {
        LinkedHashSet<Integer> ls=new LinkedHashSet<Integer>();
        ls.add(10);
        ls.add(20);
        ls.add(30);
        ls.add(30);
        ls.add(30);
        ls.add(null);
        ls.add(null);
        ls.add(40);
        for(int i=0;i<ls.size()-1;i++){
            System.out.println(ls[i]);
        }
        System.out.println(ls);
    }
}
