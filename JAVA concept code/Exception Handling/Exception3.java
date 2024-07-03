public class Exception3 {
    public static void main(String[] args) {
        String ename=null;
        try{
            System.out.println(ename.length());
            }
            catch(NullPointerException e){
                System.out.println("Exception caught");
                System.out.println(e.getMessage());
                }
                System.out.println("End of program");
                
    }
}
