public class Quiz10 {
    public static void main(String[] args) {
        StringBuffer sb1=new StringBuffer("11111");
        StringBuffer sb2=sb1.append(22222).reverse();
        System.out.println(sb1==sb2);
    }
}
