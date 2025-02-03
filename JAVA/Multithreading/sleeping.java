package Multithreading;

public class sleeping {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("A");
        Thread.sleep(1000);
        System.out.println("B");
        Thread.sleep(2000);
        System.out.println("C");
        Thread.sleep(3000);
        System.out.println("D");
    }
}