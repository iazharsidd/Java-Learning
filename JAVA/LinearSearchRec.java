import java.util.Scanner;

public class LinearSearchRec 
{
    public static int linearRec(int[] arr , int k,int idx)
    {
        if (idx < arr.length) 
        {
            if (arr[idx] == k) 
            {
                return idx;
            }
            return linearRec(arr, k, idx+1);
        }
        return -1;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the Element of the Array : ");
        for (int i = 0; i < arr.length; i++) 
        {
            arr[i] = sc.nextInt();    
        }
        System.out.print("Enter the key : ");
        int k = sc.nextInt();
        int res = linearRec(arr, k, 0);
        if (res != -1) 
        {
            System.out.println("Element is found at : "+res);
        }
        else
        System.out.println("Element is not present in the array ");
        sc.close();
    }
}
