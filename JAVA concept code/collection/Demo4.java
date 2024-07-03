import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;


public class Demo4 {
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // System.out.println("enter :");
        // int n=sc.nextInt();
       ArrayList<String> s=new ArrayList<String>();
       System.out.println(s.size());
       s.add("rahul");
       s.add("priyanka");
       s.add("sonia");
       s.add("pradosh");

       for(String name:s){
        System.out.println(name);
       }

       Iterator itr= s.iterator();
       while(itr.hasNext()){
        System.out.println(itr.next());   
       }
    }
}
