import java.util.Scanner;

public class ArrayBasic 
{
    public static void main(String[] args) 
    {
        int a,sum=0;
        System.out.print("Enter the size of Array ");
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        int arr[] = new int[a];
        for (int i = 0; i < arr.length; i++) 
        {
         arr[i]=sc.nextInt();   
        }
        for (int i = 0; i < arr.length; i++) 
        {
            System.out.print(arr[i]+" ");
            sum = sum+arr[i];
        }
        // for (int i = 0; i < arr.length; i++) 
        // {
        //    sum = sum+arr[i];
        // }
         System.out.println(sum);
        sc.close();
    }
}
