package Multithreading;

class PartnerSelection implements Runnable {
    @Override
    public void run() {
        System.out.println("Partner Selected");
    }
}
class VenueSelection implements Runnable
{
    @Override
    public void run() {
        System.out.println("Venue Selected");       
    }
}
class CardPrinting implements Runnable
{
    @Override
    public void run()
    {
        System.out.println("Card Printed");
    }
} 
class CardDistribution implements Runnable{
    @Override
    public void run()
    {
        System.out.println("Card Distributed");
    }
}

public class Marriage {
    public static void main(String[] args) {
        // Runnable p = new PartnerSelection();
        // Thread pt = new Thread(p);
        // Runnable v = new VenueSelection();
        // Thread vt = new Thread(v);
        // Runnable c = new CardPrinting();
        // Thread ct = new Thread(c);
        // Runnable cd = new CardDistribution();
        // Thread cdt = new Thread(cd);
        Thread pt = new Thread(new PartnerSelection());
        Thread vt = new Thread(new VenueSelection());
        Thread ct = new Thread(new CardPrinting());
        Thread cdt = new Thread(new CardDistribution());
        try {
            pt.start();
            pt.join(); // Waits for PartnerSelection to finish

            vt.start();
            vt.join(); // Waits for VenueSelection to finish

            ct.start();
            ct.join(); // Waits for CardPrinting to finish

            cdt.start();
            cdt.join(); // Waits for CardDistribution to finish
        } catch (InterruptedException e) {
            System.out.println("A thread was interrupted: " + e.getMessage());
        } 
    }
}
