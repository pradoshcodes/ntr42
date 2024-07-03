 class Exception7 {
    public static void main(String[] args) {
        // int i=Integer.parseInt("ten");
        // System.out.println("i = " + i);//Exception in thread "main" java.lang.NumberFormatException: For input string: "ten"

        // String ename=null;
        // System.out.println(ename.length());//Exception in thread "main" java.lang.NullPointerException


        public static void m1(){
            m2();
        }

        public static void m2(){
            m3();
        }

        public static void m3(){
            m1();
        }
    }
}
