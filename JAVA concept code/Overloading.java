class Overloading{
    public void wish(Object obj){
        System.out.println("Object");
    }
    public void wish(String s){
     System.out.println("String");
    }
    public void wish(StringBuffer B){
        System.out.println("String Buffer");
    }
    public static void main(String[] args) {
        Overloading o=new Overloading();
        o.wish(new Object());
        o.wish("Hello");
        o.wish(new StringBuffer("welcome"));
        // o.wish(null);

    }
}