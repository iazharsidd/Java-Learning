import java.util.*;
public class ArraySearch 
{
    public static void main(String[] args)
    {
        int a,s;
        System.out.print("Enter the Size of Array : ");
        Scanner sc = new Scanner(System.in);
        a =sc.nextInt();
        int arr[] = new int[a];
        for(int i = 0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the number you want to search : ");
        s = sc.nextInt();
        boolean Found = false;
        for(int i = 0;i < arr.length;i++)
        {
            if(arr[i]==s)
            {
                System.out.println("Found at "+i);
                Found = true;
            }
        }
        if (!Found)
        {
            System.out.println("Not present in the Array");  
        }
        sc.close();
    }
    
}
