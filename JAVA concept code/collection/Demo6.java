import java.util.HashSet;
import java.util.Set;

import java.util.Iterator;

public class Demo6 {
  public static void main(String[] args) {
    Set<Integer> eids= new HashSet<Integer>();
   
    eids.add(102);
    eids.add(201);
    eids.add(301);
    eids.add(301);
    eids.add(201);
    System.out.println(eids);
    
    Iterator itr=eids.iterator();
    while(itr.hasNext()){
        System.out.println(itr.next());
    }

    // for (Integer eid : eids) {
    //     System.out.println(eids);
    // }

  }  
}
