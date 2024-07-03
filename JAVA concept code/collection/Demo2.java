import java.util.ArrayList;
import java.util.List;

public class Demo2 {
    public static void main(String[] args) {
        List<String> ename=new ArrayList<String>();
        System.out.println(ename);
        ename.add("Vigor");
        ename.add("sonia");
        ename.add("harish");
        ename.add("Dinesh");
        for(int i=0;i<ename.size()-1;i++){
            System.out.println(ename[i]);
        }
        System.out.println(ename);
    }
}
