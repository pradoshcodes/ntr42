interface calI{
    public int add(int a,int b);
}

public class DaoImpl2  {
    // public int add(int a, int b){
    //     return a+b;
    // }



    public static void main(String[] args) {
        calI dao = (a,b)->a+b;
        System.out.println(dao.add(10,20));
    }

}
