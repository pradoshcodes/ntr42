abstract class Bank{
     abstract void deposit();
}



public class Account extends Bank{
    void deposit(){
        System.out.println("Balance is 1000");
    }
    public static void main(String[] args) {
        Account a = new Account();
        a.deposit();
        
    }
}
