import java.util.Scanner;

public class Array0and1
{
    public static void main(String[] args)
    {
        int a;
        System.out.print("Enter the size of array : ");
        Scanner sc = new Scanner(System.in);
        a =sc.nextInt();
        int arr[] = new int[a];
        for (int i = 0; i < arr.length; i++)
        {
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < arr.length-1; i++)
        {
            for (int j = 0; j < arr.length-1-i; j++)
            {
                if (arr[j]>0)
              {
                int temp = arr[j+1];
                arr[j+1]=arr[j];
                arr[j]=temp;
              }
            }
        }
            for (int i = 0; i < a; i++)
            {
                System.out.print(arr[i]+" ");
            }
        sc.close();
    }
}