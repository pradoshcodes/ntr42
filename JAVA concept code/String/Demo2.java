package String;

public class Demo2 {
    public static void main(String[] args) {
        String s1=new String("Rahul");
        s1.concat("Gandhi");
        System.out.println(s1);

        String s2=new String("Rahul");
        s2=s2.concat("Gandhi");
        System.out.println(s2);

        StringBuffer s3=new StringBuffer("Rahul");
        s3.append("Gandhi");
        System.out.println(s3);
    }
}
