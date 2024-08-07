
@FunctionalInterface
interface calI{
     String square(String name);
}
public class Example2 implements calI{
    public  String square(String name){
       return name;
    }
    public static void main(String[] args) {
        calI li=new Example2();
        System.out.println(li.square("Rahul"));
    }
}