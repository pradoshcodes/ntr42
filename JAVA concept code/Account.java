class Account{
     int id;
     String name;
    public void deposite_Amount(int amount){
      
        System.out.println("Amount deposited successfully");
    }
    Account(int id,String name){
        this.id=id;//This : use to access class members inside a class
        this.name=name;
        System.out.println("Employee Id:" + id + "   " +"Employee name:" + name   );
    }
    public static void main(String[] args){
        Account a=new Account(101,"vigor");
        a.deposite_Amount(5000);
    }
}
//constructor is a special types of method use to initialize object values.
//constructor will execute automatically at the time of object creation.
//constructor method we can not invoke explicitly.