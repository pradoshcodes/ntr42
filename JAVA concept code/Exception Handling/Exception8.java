public class Exception8 {

    public void withdraw(int amount){
        int acc_bal=1400;
        if(amount>acc_bal){
         throw new Insufficientbalance("balance nahi");
        }else{
            System.out.println("Enjoy");
        }

    }
    public static void main(String[] args) {
        Exception8 ex=new Exception8();
        ex.withdraw();
    }
}
