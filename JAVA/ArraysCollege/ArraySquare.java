import java.util.Scanner;

public class ArraySquare 
{
    public static void main(String[] args)
    {
        int a;
        System.out.print("Enter the size of array : ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        int arr[] = new int[a];
        System.out.print("Enter the array : ");
        for (int i = 0; i < arr.length; i++)
        {
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = arr[i]*arr[i];
        }
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i+1; j < arr.length; j++)
            {
                if (arr[i]>arr[j])
                {
                    int temp = arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++)
            { 
                System.out.print(arr[i]+" ");
            }
        sc.close();
    }
}