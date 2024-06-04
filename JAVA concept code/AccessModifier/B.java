package AccessModifier;
import AccessModifier.A;
public class B extends A{
    public static void main(String[] args) {
        A obj=new A();
        // System.out.println(obj.a);//yuo can access private within a class only
        System.out.println(obj.b);
        System.out.println(obj.c);
        System.out.println(obj.d);
    }
}
