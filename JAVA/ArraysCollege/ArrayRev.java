import java.util.Scanner;

public class ArrayRev 
{
    public static void reverse(int arr[])
    {
        int f = 0; int l = arr.length-1;
        while (f<l)
        {
            int temp = arr[l];
            arr[l] = arr[f];
            arr[f]=temp;
            f++;
            l--;
        }
    }
    public static void main(String[] args) 
    {
        int a;
        System.out.print("Enter the size of array : ");
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        int arr[] = new int[a];
        for (int i = 0; i < arr.length; i++) 
        {
           arr[i]= sc.nextInt(); 
        }
        // for (int i = a-1; i>=0 ; i--) 
        // {
        //     System.out.print(arr[i]+" ");   
        // }
        reverse(arr);
        for (int i = 0; i < arr.length; i++) 
        {
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}