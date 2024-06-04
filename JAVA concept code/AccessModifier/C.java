package AccessModifier;
import AccessModifier.A;
public class C extends A{
    public static void main(String[] args) {
        A obj=new A();
        // System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);
        System.out.println(obj.d);
    }
}
