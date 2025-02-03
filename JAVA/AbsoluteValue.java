import java.util.Scanner;

public class AbsoluteValue
{
    public static void main(String[] args) 
    {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        a = sc.nextInt();
        if (a<0)
        {
            a=a*-1;
            System.out.println("The Absolute Value is "+a);
        }
        else
        System.out.println(a);
        sc.close();
    }
}
 