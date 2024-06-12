package Quiz;

public class Quiz5 {
    public static void main(String[] args) {
        String str1="123321123";
        System.out.println(str1.replaceFirst("123", "321").replaceAll("12", "21").substring(3,6));
    }
}
