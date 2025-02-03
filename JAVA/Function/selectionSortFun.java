import java.util.Scanner;

public class selectionSortFun 
{
    public static void selctionSort(int arr[])
    {
        for (int i = 0; i < arr.length-1; i++)
        {
            int min =  Integer.MAX_VALUE;
            int idx = i;
            for (int j = i; j <= arr.length-1; j++)
            {
                if (min>arr[j])
                {
                    min =arr[j];
                    idx = j;
                }
            }
            int temp = arr[idx];
            arr[idx] = arr[i];
            arr[i] = temp;
        }
    }
    public static void print(int arr[])
    {
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]+" ");   
        }
    }
    public static void main(String[] args) 
    {
        int a;
        System.out.print("Enter the size of Array : ");
        Scanner sc = new Scanner(System.in);
        a= sc.nextInt();
        int arr[] = new int[a];
        for (int i = 0; i < arr.length; i++) 
        {
            arr[i] = sc.nextInt();
        }
        selctionSort(arr);
        print(arr);
        sc.close();
    }
}