import java.util.Scanner;
public class BubbleSortFun
{
    public static void bubbleSort(int arr[])
    {
        for (int i = 0; i < arr.length-1; i++) 
        {
            boolean flag = true;
            for (int j = 0; j < arr.length-1-i; j++)
            {
                if (arr[j]>arr[j+1])
                {
                 int temp = arr[j];
                 arr[j]=arr[j+1];
                 arr[j+1]=temp; 
                 flag = false;  
                }   
            }
            if (flag==true)
            break;
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
        a =sc.nextInt();
        int arr[] = new int[a];
        for (int i = 0; i < arr.length; i++)
        {
            arr[i]=sc.nextInt();
        }
        bubbleSort(arr);
        print(arr);
        sc.close();
    }
}