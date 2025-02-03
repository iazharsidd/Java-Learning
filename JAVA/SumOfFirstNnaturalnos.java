import java.util.Scanner;

public class SumOfFirstNnaturalnos
{
    public static void main(String[] args) 
    {
        int n,i=1,sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        n=sc.nextInt();
        while (i<n)
        {
            sum = sum + i;
            i++;
        }
         System.out.println(sum);
         sc.close();
    }
}