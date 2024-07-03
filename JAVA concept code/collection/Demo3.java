import java.util.ArrayList;
import java.util.List;

public class Demo3 {
    public static void main(String[] args) {
        List<String> ename=new ArrayList<String>();
        System.out.println(ename);
        ename.add("Vigor");
        ename.add("sonia");
        ename.add("harish");
        ename.add("Dinesh");
        System.out.println(ename);
        // for(int i=0;i<=ename.size()-1;i++){
        //     System.out.println(ename.get(i));
        // }

        for (String enames : ename) {
            System.out.println(enames);
        }
        ename.set(1, "pradosh");
        System.out.println(ename);
    }
}
