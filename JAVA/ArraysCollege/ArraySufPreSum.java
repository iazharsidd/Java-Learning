import java.util.Scanner;

public class ArraySufPreSum 
{
    static int totalSum(int arr[])
    {
        int ts = 0;
        for (int i = 0; i < arr.length; i++) 
        {
            ts+=arr[i];
        }
        return ts;
    }
    static boolean equalSumPart(int arr[])
    {
        int ts = totalSum(arr);
        System.out.print("Enter the prefix : ");
        Scanner sc = new Scanner(System.in);
         int p = sc.nextInt();
          sc.close();
           for (int i = 0; i < p; i++) 
          {
            arr[p]+=arr[i];
            int suf = ts - p;
             if (suf==p)
            {
                return true;
            }
         }
       return false;
    }
    public static void main(String[] args) 
    {
        int a;
        System.out.print("Enter the size of array : ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        int arr[] =  new int[a];
        for (int i = 0; i < arr.length; i++) 
        {
            arr[i] = sc.nextInt();
        }
       System.out.println("Equal Array Partirion possible "+equalSumPart(arr) );
        sc.close();
    }
}
