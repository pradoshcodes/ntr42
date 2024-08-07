
import java.util.Arrays;
import java.util.List;



public class StreamDemo {
        public static void main(String[] args) {
      List<String> al=Arrays.asList("Rahul","Harish","Vigor","panda");
        System.out.println(al);
        // long rename=al.stream().filter(name->name.startsWith("p")).count();
        // System.out.println(rename);

     int enames=0;

    java.util.Iterator<String> itr= al.iterator();
    while(itr.hasNext()){
        String name=itr.next();
        if(itr.next().toString().startsWith("p")){
            enames++;
            }
            }
            System.out.println(enames);

        }
    }
