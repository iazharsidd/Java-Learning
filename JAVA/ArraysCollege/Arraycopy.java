import java.util.Scanner;
import java.util.Arrays;

public class Arraycopy 
{
    public static void main(String[] args) 
    {
        int a;
        System.out.print("Enter the size of array :");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        int arr []= new int[a];
        for (int i = 0; i < arr.length; i++) 
        {
            arr[i] = sc.nextInt();
        }
        int brr[] =Arrays.copyOf(arr, a);
        for (int i = 0; i < brr.length; i++)
        {
        System.out.print(brr[i]+" ");
        }
        sc.close();
    }
}