import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class TestConsume {
    public static void main(String[] args) {
        List<String> enames=new ArrayList<>();
        enames.add("rahul");
        enames.add("sachin");
        enames.add("saurav");
        enames.add("virat");
        enames.add("dhoni");
        enames.add("rohit");
        enames.add("dhawan");
        Consumer<List> cn=name->{
            for(Object s:name){
                System.out.println(s);
            }
        };
        cn.accept(enames);
    }
}
