package Quiz;

public class Quiz1 {
    public static void main(String[] args) {
        String s1="hello";
        String s2=new String("hello");

        s2=s2.intern();
        System.out.println(s1==s2);
    }
}
