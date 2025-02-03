import java.util.Scanner;

public class foreach 
{
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of Array : ");
        a = sc.nextInt();
        int [] arr = new int[a];
        for (int i = 0; i < arr.length; i++) 
        {
            arr[i] = sc.nextInt();
        }
        //  for (int i = 0; i < arr.length; i++) 
        // {
        //     System.out.println(arr[i]+" ");
        // }
        for (int i : arr) {
            System.out.print(i+" ");
        }
        sc.close();
    }
    
}
