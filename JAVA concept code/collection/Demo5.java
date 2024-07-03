import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Demo5 {
    public static void main(String[] args) {
        List<Integer> lk=new LinkedList<Integer>();
        lk.add(10);
        lk.add(20);
        lk.add(30);
        lk.add(40);
        System.out.println(lk);

        LinkedList<String> lk2=new LinkedList<String>();
        lk2.add("Rahul");
        lk2.add("priyanka");
        lk2.add("Modi");
        lk2.add("sonia");
        System.out.println(lk2);
        System.out.println(lk2.isEmpty());
        System.out.println(lk2.size());
        System.out.println(lk2.get(1));

        Iterator itr=lk2.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        Collections.sort(lk2);
        System.out.println(lk2);

        Collections.sort(lk2,Collections.reverseOrder());
        System.out.println(lk2);


        Collections.shuffle(lk2);
        System.out.println(lk2);


        lk2.set(1, "Gabdhi");
        System.out.println(lk2);

        lk2.addFirst("subhas");
        lk2.addLast("sushma");
        System.out.println(lk2);
        

//add(),addAll(),remove(),removeAll(),size(),clear(),isEmpty(),iterator(),iscontain():methods in linked list and arraylist
    }
}
