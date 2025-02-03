package Multithreading;
class myThread extends Thread{
    @Override
    public void run(){
        Thread.currentThread().setName("My Thread");
        System.out.println("---"+Thread.currentThread().getName()+"---");
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread is Running "+i);            
        }
    }
}
public class basics 
{
    public static void main(String[] args) {
        Thread.currentThread().setName("Azhar Thread");
        System.out.println("---"+Thread.currentThread().getName()+"---");
        System.out.println(Thread.currentThread().getPriority());
        myThread t1 = new myThread();
        // t1.run();
        t1.start();
        for (int i = 1; i <= 5; i++) {
            System.out.println("Main Thread "+i);
        }
    }   
}