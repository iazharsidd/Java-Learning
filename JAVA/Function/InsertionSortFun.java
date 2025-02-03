import java.util.Scanner;

public class InsertionSortFun 
{
    public static void insertionSort(int arr[])
    {
        for (int i = 1; i < arr.length; i++) 
        {
            int j = i;
            while (j>=1 && arr[j]<arr[j-1])
            {
              int temp = arr[j];
              arr[j] = arr[j-1];
              arr[j-1] = temp;   
              j--;
            }
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
      a = sc.nextInt();
      int arr[] = new int[a];
      for (int i = 0; i < arr.length; i++) 
      {
         arr[i] = sc.nextInt();
      }
          insertionSort(arr);
          print(arr);
      sc.close();
    }
}