package Multithreading;

class Innerinterrupt extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Child Class invoked : " + i);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                System.out.println("I got interrupted......:/");
            }
        }
    }
}

public class interrupt {
    public static void main(String[] args) {
        Innerinterrupt ip = new Innerinterrupt();
        ip.start();
        ip.interrupt();
        for (int i = 0; i < 5; i++) {
            System.out.println("Main class invoked: " + i);
        }
    }
}
