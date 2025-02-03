import java.util.Scanner;

public class largestof2
 {
    public static void main(String[] args) 
    {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a :");
        a = sc.nextInt();
        int b;
        System.out.print("Enter b :");
        b = sc.nextInt();
        if (a > b)
         {
            System.out.println(a);
         }
          else 
         {
            System.out.println(b);
         }
         sc.close();
    }
}
