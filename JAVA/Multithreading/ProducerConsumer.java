package Multithreading;

import java.util.LinkedList;

class Data
{
    LinkedList<Integer> dataPipeline = new LinkedList<>();
    int min_cap = 2;
    public void  producer() throws InterruptedException
    {
        int data = 0;
        while (true) {
            synchronized(this)
            {
                while (dataPipeline.size() == min_cap) {
                    this.wait();
                }
                System.out.println("Producer Produced - "+data);
                dataPipeline.add(data++);
                if (dataPipeline.size() >= min_cap) {
                    this.notify();
                }
                Thread.sleep(1000);
            }
        }
    }
    public void consumer() throws InterruptedException
    {
        while (true) 
        {
            synchronized(this)
            {
                while (dataPipeline.size() == 0) 
                {
                    this.wait();
                }
                int val = dataPipeline.removeFirst();
                System.out.println("Consumer consumed "+val);
                if (dataPipeline.size() == 0){
                    this.notify();
                    Thread.sleep(1000);
                }
            }
        }
    }
}
public class ProducerConsumer {
    public static void main(String[] args) {
        Data dt = new Data();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run(){
                try {
                    dt.producer();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                };
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run()
            {
                try {
                    dt.consumer();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t1.start();
        t2.start();
    }
}