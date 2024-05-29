public class Signature {
    public void m1(int x){
        System.out.println("this is a float.");
    }
    public int m1(float y){
        System.out.println("this is an int.");
        return 10;
    }
    public static void main(String[] args) {
        Signature s = new Signature();
        s.m1(10);
        s.m1(10.5f);
    }
}
