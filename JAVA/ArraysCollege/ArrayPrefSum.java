import java.util.Scanner;

public class ArrayPrefSum 
{
    public static void main(String[] args)
    {
        int a;
        System.out.print("Enter the size of array : ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        int arr[] = new int[a];
        System.out.print("Enter the Array : ");
        for (int i = 0; i < arr.length; i++) 
        {
            arr[i] = sc.nextInt();
        }
        // System.out.print("Enter the prefix : ");
        // int p = sc.nextInt();
        // for (int i = 0; i < p; i++) 
        // {
        //     arr[p]+=arr[i];
        // }
        for (int i = 1; i < arr.length; i++) 
        {
          arr[i]+=arr[i-1];   
        }
        for (int i = 0; i < arr.length; i++) 
        {
         System.out.print(arr[i]+" ");   
        }
        sc.close();
    }
}