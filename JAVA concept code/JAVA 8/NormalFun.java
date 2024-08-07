
public class NormalFun implements InnerUserLam {
    public boolean test(int num){
        return num%2==0;
    }
    public static void main(String[] args) {
        InnerUserLam iu= new NormalFun();
        System.out.println(iu.test(56));
    }
}
