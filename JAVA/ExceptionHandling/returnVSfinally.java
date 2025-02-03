public class returnVSfinally {
    public static int myApp()
    {
        try{
            // System.out.println(10/0);//case 1
            System.out.println("Try executed");
            return 1;
        }
        catch(Exception e){
            System.out.println("Cathch executed");//case 2
            return 2;
        }
        finally{
            System.out.println("Finally executed");
            // return 3;// case 3
        }
    }
    public static void main(String[] args) {
        //finally dominates return 
    //     try {
    //         return;
    //     } catch (Exception e) {
    //         // handle exception
    //         System.out.println("no");
    //     } finally {
    //         System.out.println("this is finally ");
    //     }
    System.out.println(myApp());
    }
}