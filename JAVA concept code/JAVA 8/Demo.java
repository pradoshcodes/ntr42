
@FunctionalInterface
interface Dao {

    public void login();
}


public class Demo implements Dao {

    public void login(){
        System.out.println("login suceesfully");
    }

    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.login();
    }

    // @Override
    // public void logout() {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'logout'");
    // }
}