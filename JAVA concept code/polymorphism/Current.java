package polymorphism;

public class Current extends  Account{
    private  int min_Bal=10000;
    //generate setters and getters

    public int getMin_Bal() {
        return min_Bal;
    }

    public void setMin_Bal(int min_Bal) {
        this.min_Bal = min_Bal;
    }
    public int  cal_Bal(){
       int bal = this.getAcc_Bal() - this.getMin_Bal();
       return bal;
    }
}
