package Multithreading;
class InnerLocking implements Runnable  
{
    @Override
    public void run() {
        // lockingNonStaticMethod();
        lockingStaticMethod();
    }
    // public void lockingNonStaticMethod()
    // {
    //     //object level locking 
    //     System.out.println(Thread.currentThread().getName()+" Got the lock");
    //     synchronized (this){
    //         System.out.println("Synchronised code executed by :"+Thread.currentThread().getName());
    //         System.out.println("Synchronised code ended by :"+Thread.currentThread().getName());
    //         System.out.println("------");
    //     }
    // }
    public static synchronized void lockingStaticMethod()
    {
        synchronized(InnerLocking.class)
        {
            System.out.println("Synchronised code executed by :" + Thread.currentThread().getName());
            System.out.println("Synchronised code ended by:"+Thread.currentThread().getName());
            System.out.println("------");
        }
    }
}
public class locking {
 public static void main(String[] args) {
    InnerLocking i = new InnerLocking();
    InnerLocking j = new InnerLocking();
    Thread t = new Thread(i);
    Thread s = new Thread(j);
    t.setName("Thread t");
    s.setName("Thread s");
    t.start();
    s.start();
 }   
}
