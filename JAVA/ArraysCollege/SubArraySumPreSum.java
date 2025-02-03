import java.util.Scanner;

public class SubArraySumPreSum 
{ 
    public static void prefSum(int arr[])
    {
        for (int i = 1; i < arr.length; i++) 
        {
            arr[i]+=arr[i-1];
        }
    }
 public static void main(String[] args)
{
   int a,max=Integer.MIN_VALUE; 
   System.out.print("Enter the size of Array : ");
   Scanner sc = new Scanner(System.in);
   a =sc.nextInt();
   int arr[] = new int[a];
   for (int i = 0; i < arr.length; i++) 
   {
     arr[i]=sc.nextInt();
   }
      prefSum(arr);
      for (int i = 0; i < arr.length; i++) 
      {
        System.out.print(arr[i]+" ");
        if (max<arr[i])
        {
            max=arr[i];
        }
      }
      System.out.println(max);
   sc.close();
}   
}