public class flow {
    public static void main(String[] args) {
        System.out.println("Azhar");
        System.out.println("Siddiqui");
        try {
            System.out.println("No Exception At All");
            System.out.println("Love you Zindagi" + 10/0);
        }
        catch(NullPointerException e){
            System.out.println("null pointer ");
        }
        catch(ArithmeticException g)
        {
            g.printStackTrace();
            System.out.println("Arithmatic exception");
            // System.out.println("10/0"+10/0); will termionate the whole flow as there is no handler 
        }
         catch (Exception e) {
            //  handle exception
            System.out.println("Jab Exception ka pata na ho to mujhe use krna ");
        }
        System.out.println("Bro cOde ");
    }
}