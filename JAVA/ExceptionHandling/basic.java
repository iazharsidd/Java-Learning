public class basic 
{
    public static void main(String[] args) {
        System.out.println("Hello");
        try {
            // try only contains risky code 
            System.out.println(10/0);
        } catch (ArithmeticException e) {
            //  handle exception
            System.out.println("number can't be divided by zero");
            System.out.println(10/2);
            System.out.println("Exception resolved");
        }
        System.out.println("program Ended");
    }
}