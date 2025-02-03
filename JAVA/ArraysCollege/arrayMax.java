import java.util.Scanner;

public class arrayMax 
{
    public static void main(String[] args)
    {
        int a,max=0;
        System.out.print("Enter the size of Array : ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        int arr[] = new int[a];
        for (int i = 0; i < arr.length; i++) 
        {
            arr[i]=sc.nextInt();
        }  
        for (int i = 0; i < arr.length; i++) 
        {
            if (arr[i]>max)
            {
              max=arr[i] ;  
            }
        }
        System.out.println("Maximum is = "+max);
        sc.close();
    }
}
