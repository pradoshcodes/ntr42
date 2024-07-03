import java.util.Collection;
import java.util.HashMap;

import java.util.Map;
import java.util.Set;

import javax.swing.RowFilter.Entry;

class Test {
    public static void main(String[] args) {
        HashMap<String,String> pr=new HashMap<String,String>();
        pr.put("P_Id","101");
        pr.put("P_Name","samsung");
        pr.put("Price","45000");
        pr.put("Color","Red");  
          pr.put("Avail", "True");
          Set<String> key=pr.keySet();
          for(String keys:key){
                System.out.println(pr.get(keys));
          }

          Collection<String> val=pr.values();
          for (String vals : val) {
            System.out.println(vals);
          }

          Set<Map.Entry<String,String> set = pr.entrySet();
        
          for (String sets : set) {
            System.out.println(sets.);
          } 


    }
}
