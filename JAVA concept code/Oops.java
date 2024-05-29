class Oops{
    private int emp_id;
    public void set_emp_id(int id){//setter method
        this.emp_id=id;
    }
    public int get_emp_id(){//getter methods
        return this.emp_id;
    }
    public static void main(String[] args) {
        Oops obj=new Oops();
        obj.set_emp_id(123);    
        System.out.println(obj.get_emp_id());
    }
}//by using setter and getter we can access private modifier