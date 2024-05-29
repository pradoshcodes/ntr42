public class SingleInherit {
    public static void m1(){
        System.out.println("parent class m1 method");
    }
}
class Child extends SingleInherit{
    public static void m1(){
        System.out.println("child class m1 method");
    }
}
class Test{
    public static void main(String[] args) {
        Child obj=new Child();
        obj.m1();
    }
}
