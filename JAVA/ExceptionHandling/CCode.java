public class CCode 
{
    public static void main(String[] args) {
        try {
            System.out.println("Try block executed ");
        } catch (Exception e) {
            // handle exception
            System.out.println("Catch block executed ");
        } finally {
            System.out.println("Finally Block executed");
        }
    }
    
}
