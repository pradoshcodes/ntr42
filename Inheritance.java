class Parent{
    public void m1(){
        System.out.println("parent class method");
    }
}
class Child extends Parent{
    public void m2(){
      System.out.println("child class method");
    }
}




public class Inheritance {
    public static void main(String[] args) {
        Parent p=new Parent();
        Child c=new Child();
        p.m1();
        c.m1();
        c.m2();
    }
}
