public class Thrws {
    static void m1() throws InterruptedException
    {
        Thread.sleep(1000);
        System.out.println("Code running fine");
    }
    static void m2() throws InterruptedException
    {
        m1();
    }
    static void m3() throws InterruptedException
    {
        m2();
    }
    public static void main(String[] args) throws InterruptedException {
        // Thread.sleep(1000);
        // System.out.println("Code running fine");
        m3();
    }   
}