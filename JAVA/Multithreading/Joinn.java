package Multithreading;
class InnerJoinn implements Runnable {
    private Thread mainThread;
    public InnerJoinn(Thread mainThread)
    {
        this.mainThread = mainThread;
    }
    @Override
    public void run()
    {
        try {
            mainThread.join();
        } catch (InterruptedException e) {
            // handle exception
            System.out.println("Caught an Exception");
        }
        for (int i = 0; i < 5; i++) 
        {
            System.out.println("MYTHREAD : "+i);
        }
    }
}
public class Joinn {
    public static void main(String[] args) throws InterruptedException{
        Thread mainThread = Thread.currentThread();
        Runnable r = new InnerJoinn(mainThread);
        Thread t = new Thread(r);
        t.start();
        // t.join();
        for (int i = 0; i < 5; i++) {
            System.out.println("Main Thread "+i);            
        }   
    }
}
