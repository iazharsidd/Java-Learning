import java.util.Scanner;

public class ArrayprefSumQuerry
{
    static int [] prefixsum(int arr[])
    {
        for (int i = 1; i < arr.length; i++)
        {
            arr[i]+=arr[i-1];
        }
        return arr;
    }
    public static void main(String[] args)
    {
        int a;
        System.out.print("Enter the size of Array : ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        int arr[] = new int[a+1];
        System.out.print("Enter Array : ");
        for (int i = 1; i <= a; i++) 
        {
            arr[i]=sc.nextInt();
        }
        int prefSum[] = prefixsum(arr);
        System.out.print("Enter the number of querries : ");
        int q = sc.nextInt();
        while (q-- > 0)
        {
            System.out.print("Enter range l : ");
            int l = sc.nextInt();
            System.out.print("Enter range r : ");
            int r = sc.nextInt();
            int sum = prefSum[r]-prefSum[l-1];
            System.out.println(sum);
        }
        sc.close();
    }
}
