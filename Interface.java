
public interface Interface {

     void cal_bal();//declaration 
     void cal_bal2();
     void cal_bal3();
     void cal_bal4();
} 
class Abstractkey implements Interface{
    public void cal_bal() {
        System.out.println("This interface");
    }
    //definition
    public void cal_bal2() {
        System.out.println("This interface two");//if you use default instead of public this will give error: attempting to weaker access priviliges.to assign higer preference to lower  it good otherwise it will show error. 
    }
    public void cal_bal3() {
        System.out.println("This interface three");
    }
    public void cal_bal4() {
        System.out.println("This interface four");
    }
    public static void main(String[] args) {
        Abstractkey obj = new Abstractkey();
        obj.cal_bal();
        obj.cal_bal2();
        obj.cal_bal3();
        obj.cal_bal4();
        
    }

}



