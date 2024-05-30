public class ConstruDemo {
    int id;
    String name;
    
    ConstruDemo(int id,String name){
        System.out.println("const exe automatically");
        this.id=id;
        this.name=name;

    }
    public static void main(String[] args) {
        ConstruDemo obj=new ConstruDemo(1,"Rahul");
    }
}
