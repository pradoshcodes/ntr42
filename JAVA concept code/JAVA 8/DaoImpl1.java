@FunctionalInterface
 interface InnerDaoImpl1 {
   void login();
    
}

public class DaoImpl1 {
    public static void main(String[] args) {
        InnerDaoImpl1 dao=()->{System.out.println("Login succesfully");};
        dao.login();
    } 
}

    

