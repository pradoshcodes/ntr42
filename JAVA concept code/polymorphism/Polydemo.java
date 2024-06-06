package polymorphism;


public class Polydemo {
    public static void main(String[] args) {
        Saving sa1=new Saving();
        sa1.setAcc_Id(101);
        sa1.setAcc_Name("Rahul");
        sa1.setAcc_Bal(5000);

        //print balance
        //System.out.println("Account Id:"+sa1.getAcc_Id()+":Name"+sa1.getAcc_Name()+" and Bal is:"+sa1.cal_Bal());

        Current ca1=new Current();
        ca1.setAcc_Id(102);
        ca1.setAcc_Name("Sonia");
        ca1.setAcc_Bal(60000);
        //System.out.println("Account Id:"+ca1.getAcc_Id()+":Name"+ca1.getAcc_Name()+" and Bal is:"+ca1.cal_Bal());
       AccountService.get_Service(sa1);
       AccountService.get_Service(ca1);
    }
}
