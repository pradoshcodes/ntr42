public class SetGet {
    private int enumvalue;
    private String ename;

public int getEnum(){
    return this.enumvalue;
}

public void setEnum(int enumvalue) {
    this.enumvalue = enumvalue;

}

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

}

class A {
    public static void main(String[] args) {

        SetGet s = new SetGet();
        s.setEnum(101);
        s.setEname("vigor");
        System.out.println("Enum Value: " + s.getEnum());
         System.out.println("Ename: " + s.getEname());
    }
}

