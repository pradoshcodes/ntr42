@FunctionalInterface
 interface InnerUserLam {
 boolean test(int num);
    
}
public class UserLam {
    public static void main(String[] args) {
        InnerUserLam innerUserLam = (num) -> num > 10;
        System.out.println(innerUserLam.test(11));
        
    }
}
