class A {
     int a=100;
     void show(){
        System.out.println("This is a parent class");
     }
}
class B extends A{
    int b=super.a;
    void show(){
        super.show();
        System.out.println("This is a child class");
    }
}




public class SuperKey {
    public static void main(String[] args) {
        B a=new B();
        a.show();
        System.out.println(a.b);

    }
}
