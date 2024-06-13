
public class Autoboxing {
public static void main(String[] args) {
    int a=100;
    // Integer i=a;
    Integer i= Integer.valueOf(a);//autoboxing

    // int b=i;
    int b=i.intValue();//unboxing
    System.out.println(a);
    System.out.println(b);
}
    
}