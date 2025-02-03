import java.util.Scanner;

public class ArrayOccur 
{
    public static void main(String[] args)
    {
        int a,o,c=0,idx=-1,g=0;
        System.out.print("Enter the size of array : ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        int arr[] = new int[a];
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] =sc.nextInt();
        }
          System.out.print("Enter occured Element : ");
           o = sc.nextInt();
        for (int i = 0; i < arr.length; i++) 
        {
            if (arr[i]==o)
            {
             c++;
             idx = i;   
            }
            if(arr[i]>5)
            g++;
        }
        System.out.println(c);
        System.out.println(idx +" "+g);
        sc.close();
    }
}
