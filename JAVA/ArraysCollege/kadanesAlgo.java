import java.util.Scanner;

public class kadanesAlgo
{
    public static void main(String[] args) 
    {
        int a,cr=0,ms=Integer.MIN_VALUE;
        System.out.print("Enter the size of Array : ");
        Scanner sc = new Scanner(System.in);
        a =  sc.nextInt();
        int arr[] = new int[a];
        for (int i = 0; i < arr.length; i++)
        {
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) 
        {
            cr+=arr[i];
            if (cr<0)
            {
             cr=0;   
            }
             if (ms<cr)
             {
              ms=cr;  
             }
            System.out.println("current sum = "+cr);
            System.out.println("max sum = "+ms);
        }
        sc.close();
    }
}