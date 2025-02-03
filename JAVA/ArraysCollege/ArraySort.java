import java.util.Scanner;

public class ArraySort 
{
    public static void main(String[] args) 
    {
        int a;
        boolean flag =true;
        System.out.print("Enter the size of array : ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        int arr[] = new int[a];
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        for (int i = 1; i < arr.length; i++) 
        {
            if (arr[i]<arr[i-1])
            {
                flag = false;
                break;
            }
        } 
        if (flag==true) 
        {
            System.out.println("Sorted");            
        }
        else System.out.println("Not sorted");
        sc.close();
    }
}
