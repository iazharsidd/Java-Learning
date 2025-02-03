import java.util.Scanner;

public class ArrayPartitionSumEqual 
{
    public static void main(String[] args)
    {
        int a,sum1=0,sum2=0;
        System.out.print("Enter the size of array : ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        int arr[] = new int[a];
        for (int i = 0; i < arr.length; i++)
        {
            arr[i]=sc.nextInt();
        }
        int h = arr.length/2;
        System.out.println("h="+h);
        for (int i = 0; i < h; i++) 
        {
          sum1+=arr[i];   
        }
        System.out.println("Sum1="+sum1);
         for (int i = h; i < arr.length; i++) 
        {
          sum2+=arr[i];   
        }
         System.out.println("Sum2="+sum2);
         if (sum1==sum2)
        {
         System.out.println("Equal");   
        }
        else
        System.out.println("Not Equal");
        sc.close();
    }
}
