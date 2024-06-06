// public class Stringdemo {
//     public static void main(String[] args) {
//         String s1=new String("Rahul");
//         s1=s1.concat("Gandhi");
//         System.out.println(s1);
//         string s1=s1.concat("Is good boy");//here reference is required
//         System.out.println(s1);
//     }
// }

public class Stringdemo {
    public static void main(String[] args) {
        StringBuffer s1=new StringBuffer("rahul");
        s1=s1.append("Gandhi");//reference is not required
        System.out.println(s1);
    }
}