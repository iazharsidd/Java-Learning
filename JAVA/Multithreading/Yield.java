package Multithreading;
class MYt implements Runnable 
{
    @Override
    public void run(){
        Thread.currentThread().setName("MyThread");
        Thread.currentThread().setPriority(4);
        Thread.yield();
        for (int i = 0; i < 5; i++) 
        {
            System.out.println(Thread.currentThread().getName()+":"+Thread.currentThread().getPriority());
            
        }
    }
}
public class Yield {
    public static void main(String[] args) {
        Runnable r = new MYt();
        Thread t = new Thread(r);
        t.start();
        System.out.println(Thread.currentThread().getName() + ":" + Thread.currentThread().getPriority());
        for (int i = 0; i < 5; i++) 
        {
            System.out.println(Thread.currentThread().getName()+":"+Thread.currentThread().getPriority());
        }
    }
}
