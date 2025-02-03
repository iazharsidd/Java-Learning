import java.util.Scanner;

public class SubArraySum 
{
    public static void main(String[] args)
    {
        int a,max = Integer.MIN_VALUE;
        System.out.print("Enter the sizeof array : ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        int arr[] = new int[a];
        for (int i = 0; i < arr.length; i++) 
        {
         arr[i] = sc.nextInt();   
        }
        for (int i = 0; i < arr.length; i++) 
        {  
         for (int j = i; j < arr.length; j++) 
         {
            int sum=0;
            for (int k = i; k <=j; k++) 
            {
                sum+=arr[k];
            }
            System.out.print(sum+" ");
            if (max<sum) 
            {
                max=sum;
            }
         }   
         System.out.println();
        }
        System.out.println("Maximum Sum is = "+max);
        sc.close();
    }
}