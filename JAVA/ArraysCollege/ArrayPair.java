import java.util.Scanner;

public class ArrayPair 
{
    public static void main(String[] args) 
    {
        int a,nOp=0;
        System.out.print("Enter the size of array : ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        int arr[] = new int[a];
        for (int i = 0; i < arr.length; i++) 
        {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i+1; j < arr.length; j++) 
            {
              System.out.print("("+arr[i]+","+arr[j]+")");  
              nOp++; 
            }
            System.out.println();
        }
         System.out.println(nOp);
        sc.close();
    }
}
