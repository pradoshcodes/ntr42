
 interface InnerMethodsDemo {

    int number=100;//bydefault all the varibles in interface class is final and static.
}

public class MethodsDemo implements InnerMethodsDemo{
    public static void main(String[] args) {
        MethodsDemo  v = new MethodsDemo();
        System.out.println(number);
        System.out.println(v.number);
        System.out.println(MethodsDemo.number);
    }
}
