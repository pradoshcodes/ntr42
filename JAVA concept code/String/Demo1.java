package String;

public class Demo1 {
    
}
 class Child extends  Demo1{

 }
class Test{
    public static void main(String[] args) {
        Demo1 p1=new Demo1();
        Child c1=new Child();
        int a=10;
        int b=20;
        int c=10;
        String s1=new String("Rahul");
        String s2="Rahul";
        String s3="Rahul";
        String s4=new String("Rahul");
        System.out.println(a.equals(c));
        //System.out.println();
        System.out.println(p1.equals(c1));//false
        System.out.println();
    }
}