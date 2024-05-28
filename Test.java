// class Test{
//     int eid1;//instance avrible
//     static int eid2;//static varible

//     public static void main(String[] args) {
//         int eid3;//local varible 
//         System.out.println(eid2);
//     }
// }

// class Test{
 

//     public static void main(String[] args) {
//         int eid3;//local varible 
//         System.out.println(eid3);//in local varible initialization is required but in static and instance varible it provide default values
//     }
// }

// class Test{
 
//   int a=100;
//     public static void main(String[] args) {
//        Test t = new Test();
//         System.out.println(t.a);//to run this code we have to create an object of this instance varible
//         //if we don;t create an object it gives compiler time error
//     }
// }



/**
 * Test
 */
// public class Test {
//     static int a=100;
// public static void main(String[] args) {
    
// }
// }

// class Test{
//     int x=100;
//     int y=200;
//     static int z=300;
//     public static void main(String[] args) {
//         Test t = new Test();
//         Test t1=new Test();
//         t.z=200;
//         t1.y=300;
//         System.out.println(t.x + t.y + t.z);
//         System.out.println(t1.x + t1.y + t1.z);
//     }
// }
        

// class Test{
//     public static void main(String[] args) {
//         for(int i=0;i<=args.length-1;i++){
//             System.out.println(args[i]);
//         }
//     }
// }


class Parent{
    void m1(){}
    void m2(){}
}

class Child extends Parent{
    void m3(){}
}
public class Test{
    public static void main(String[] args) {
        Parent p= new Parent();
        p.m1();
        p.m2();
         Child c= new Child();
        Parent p1 = new Child();
    }
}