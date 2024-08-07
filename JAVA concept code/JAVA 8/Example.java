
    @FunctionalInterface
 interface InnerUserLam {
 String test(String name);
    
}
public class Example  {
    public static void main(String[] args) {
        InnerUserLam innerUserLam = (name) -> name.toUpperCase();
        System.out.println(innerUserLam.test("Rahul"));
        
    }
}

