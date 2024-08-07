@FunctionalInterface
interface calI{
     int square(int num);
}
public class Demo3 implements calI{
    public  int square(int num){
       return num*num;
    }
    public static void main(String[] args) {
        calI li=new Demo3();
        System.out.println(li.square(10));
    }
}
