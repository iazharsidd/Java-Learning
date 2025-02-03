package Multithreading;
class user{
    public user() throws InterruptedException{
        Hotstar ht = new Hotstar();
        ht.start();
        synchronized(ht){
            System.out.println("Waiting....");
            ht.wait();
            System.out.println("Notified....");
        }
    }
}
class Hotstar extends Thread{
    @Override
    public void run()
    {
        synchronized(this)
        {
            for (int i = 10; i >= 0; i--){
                System.out.println("Match Begins in "+i+"seconds");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("LIVE NOW.....");
            this.notify();
        }
    }
}
public class Comminucation {
    public static void main(String[] args) throws InterruptedException {
        user u = new user();

    }
}
