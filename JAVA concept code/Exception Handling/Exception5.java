import java.io.FileInputStream;

public class Exception5 {
    public static void main(String[] args) {
    //    String name=null;
    //    System.out.println(name.length()); //this is a unchecked exception beacuse compiler doesnot check at the compilation time.
    try{
        FileInputStream fis=new FileInputStream("Test.java");

    }catch(Exception e){
        System.out.println("File not found");
    }
    }
}
