public class interview 
{
    public static void main(String[] args) 
    {
        // int n = 2;
        // for (int i = 2; i < 4; i++) 
        // {
        //     if (n % i == 0) {
        //         System.out.println("hello");
        //     } else
        //         System.out.println("World");
        // }
        int n = 12345;
        int sum = 0;
        int t ;
        while (n>0) 
        {
            t = n%10;
            if (t%2 == 0) 
            {
                sum = sum + t;
            }
            n = n/10;
        } 
        System.out.println(sum);
    }
}
// select salary;
// count employee
// where 20000 AND 50000;