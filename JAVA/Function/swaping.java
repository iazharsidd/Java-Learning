import java.util.Scanner;

public class swaping
{
    public static void swap ( int a, int b )
    {
        int temp=a;
        a=b;
        b=temp;
        System.out.println("The value of a is " +a);
        System.out.println("The value of b is " +b);
    }
   public static void main(String[] args)
   {
    int a;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the First number : ");
    a=sc.nextInt();
    int b;
    System.out.print("Enter the Second number : ");
    b=sc.nextInt();
    swap(a,b);
     sc.close();
   } 
}