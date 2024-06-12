package AccessModifier;

public class Equals {}

class A{}

class B{
    public static void main(String[] args) {
        // String s1=new String("diglu");
        // String s2=new String("paplu");
        // System.out.println(s1.equals(s2));

        A a=new A();
        B b=new B();
        System.out.println(a.equals(b));

    }
}
