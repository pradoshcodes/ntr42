class Exception{
    public static void main(String[] args) {
        System.out.println(10/2);
        try {
            int a = 10 / 0;
            System.out.println("This will not be printed");
            } catch (ArithmeticException e) {
                e.printStackTrace(e);
                System.out.println(10/1);
            }
            System.out.println(10/5);
    }
}