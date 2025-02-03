package Multithreading;
class RThread implements Runnable{
    @Override
    public void run(){
        for (int i = 0; i < 5; i++) 
        {
            System.out.println("Thread By Runnable INTERFACE = "+i);
            
        }
    }
    
}
public class RunnableInterface {
    public static void main(String[] args) {
        Runnable r = new RThread();
        Thread t = new Thread(r);
        t.start();
    }    
}
