package Recursion;
import java.util.Scanner;
public class MaxInArray 
{
    public static int max(int arr[],int idx)
    {
        if(idx == arr.length-1)
        {
            return arr[idx];
        }
        int s = max(arr, idx+1);
        return Math.max(arr[idx], s);
    }
    public static void main(String[] args) 
    {
        int a;
        System.out.print("Enter the size of the Array : ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        int arr[] = new int[a];
        for (int i = 0; i < arr.length; i++) 
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(max(arr, 0));
        sc.close();
    }
}
