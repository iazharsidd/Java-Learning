public class Thrw 
{
    static ArithmeticException e = new ArithmeticException();
    // static ArithmeticException ae = null;
    public static void main(String[] args) 
    {
        //  System.out.println(10/0); 
        // throw new ArithmeticException("Reason :  / by zero");
        throw e;
        // System.out.println();//unreachable code
        // throw ae;
    }    
}
