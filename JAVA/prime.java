import java.util.Scanner;

public class prime {
    public static void main(String[] args) 
    {
        int n;
        boolean isPrime= true;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        n = sc.nextInt();
        for (int i = 2; i < n;i++)
        {
            if (n%i==0)
            {
            isPrime=false;
            }
        }
            if(isPrime==false)
            {
                System.out.println("Not Prime");
            }
            else
            System.out.println("Prime");
             sc.close();
        }
    }